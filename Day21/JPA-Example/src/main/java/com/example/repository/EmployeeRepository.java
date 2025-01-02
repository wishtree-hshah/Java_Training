package com.example.repository;

import com.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * The interface Employee repository.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    /**
     * Count employees by gender long.
     *
     * @param gender the gender
     * @return the long
     */
    @Query("SELECT COUNT(e) FROM Employee e WHERE e.gender = :gender")
    Long countEmployeesByGender(@Param("gender") String gender);
}
