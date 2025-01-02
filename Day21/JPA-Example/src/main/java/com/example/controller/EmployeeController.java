package com.example.controller;

import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * The type Employee controller.
 */
@RestController
@RequestMapping("/api")
public class EmployeeController {
    private EmployeeService employeeService;

    /**
     * Instantiates a new Employee controller.
     *
     * @param employeeService the employee service
     */
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * Add new employee response entity.
     *
     * @param employee the employee
     * @return the response entity
     */
    @PostMapping("/employee")
    public ResponseEntity<?> addNewEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    /**
     * Get employee response entity.
     *
     * @return the response entity
     */
    @GetMapping("/employee")
    public ResponseEntity<?> getEmployee(){
        List<Employee> employeeList = employeeService.findAll();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    /**
     * Get employee by id response entity.
     *
     * @param employeeId the employee id
     * @return the response entity
     */
    @GetMapping("/employee/{employeeId}")
    public ResponseEntity<?> getEmployeeById(@PathVariable long employeeId){
        Optional<Employee> employee = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }

    /**
     * Update employee response entity.
     *
     * @param employeeId the employee id
     * @param employee   the employee
     * @return the response entity
     */
    @PatchMapping("/employee/{employeeId}")
    public ResponseEntity<?> updateEmployee(@PathVariable long employeeId,@RequestBody Employee employee){
        Employee updatedEmployee = employeeService.updateEmployee(employee, employeeId);
        return new ResponseEntity<>(updatedEmployee,HttpStatus.OK);
    }

    /**
     * Delete employee response entity.
     *
     * @param employeeId the employee id
     * @return the response entity
     */
    @DeleteMapping("/employee/{employeeId}")
    public ResponseEntity<?> deleteEmployee(@PathVariable long employeeId){
        String deletedEmployee = employeeService.deleteEmployee(employeeId);
        return new ResponseEntity<>(deletedEmployee,HttpStatus.OK);
    }

    /**
     * Count employees by gender response entity.
     *
     * @param gender the gender
     * @return the response entity
     */
    @GetMapping("/employees/countByGender")
    public ResponseEntity<?> countEmployeesByGender(@RequestParam String gender) {
        long count = employeeService.countEmployeesByGender(gender);
        return new ResponseEntity<>(count,HttpStatus.OK);
    }
}
