package com.example.demoNaz.repository;

import com.example.demoNaz.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findAll();
    List<Employee> findByAcc(String acc);
    List<Employee> findEmployeesByClient(String client);
}
