package com.example.service;

import com.example.entity.Employee;
import com.example.exception.EmployeeNotFoundException;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * The type Employee service.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    /**
     * Instantiates a new Employee service.
     *
     * @param employeeRepository the employee repository
     */
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> getEmployeeById(long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()){
            return employee;
        }
        throw new EmployeeNotFoundException("Employee with ID " + id + " not found.");
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        Optional<Employee> matchingEmployeeOpt = getEmployeeById(id);
        if (matchingEmployeeOpt.isPresent()) {
            Employee matchingEmployee = matchingEmployeeOpt.get();

            if (employee.getName() != null) {
                matchingEmployee.setName(employee.getName());
            }
            if (employee.getCity() != null) {
                matchingEmployee.setCity(employee.getCity());
            }
            if (employee.getEmail() != null) {
                matchingEmployee.setEmail(employee.getEmail());
            }
            if (employee.getGender() != null) {
                matchingEmployee.setGender(employee.getGender());
            }
            employeeRepository.save(matchingEmployee);
            return matchingEmployee;
        }
        throw new EmployeeNotFoundException("Employee with ID " + id + " not found.");
    }


    @Override
    public String deleteEmployee(long id) {
        Optional<Employee> matchingEmployeeOpt = getEmployeeById(id);
        if(matchingEmployeeOpt.isPresent()){
            Employee matchingEmployee = matchingEmployeeOpt.get();
            employeeRepository.delete(matchingEmployee);
            return "Employee with id: " + id + " is removed successfully";
        }
        throw new EmployeeNotFoundException("Employee with ID " + id + " not found.");
    }

    @Override
    public Long countEmployeesByGender(String gender) {
        return employeeRepository.countEmployeesByGender(gender);
    }
}
