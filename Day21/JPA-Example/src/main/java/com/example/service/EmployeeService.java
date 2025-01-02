package com.example.service;

import com.example.entity.Employee;

import java.util.List;
import java.util.Optional;

/**
 * The interface Employee service.
 */
public interface EmployeeService {
    /**
     * Find all list.
     *
     * @return the list
     */
    public List<Employee> findAll();

    /**
     * Add employee.
     *
     * @param employee the employee
     */
    public void addEmployee(Employee employee);

    /**
     * Gets employee by id.
     *
     * @param id the id
     * @return the employee by id
     */
    public Optional<Employee> getEmployeeById(long id);

    /**
     * Update employee employee.
     *
     * @param employee the employee
     * @param id       the id
     * @return the employee
     */
    public Employee updateEmployee(Employee employee,long id);

    /**
     * Delete employee string.
     *
     * @param id the id
     * @return the string
     */
    public String deleteEmployee(long id);

    /**
     * Count employees by gender long.
     *
     * @param gender the gender
     * @return the long
     */
    public Long countEmployeesByGender(String gender);
}
