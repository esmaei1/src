package com.example.src.repository;

import com.example.src.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository     
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
