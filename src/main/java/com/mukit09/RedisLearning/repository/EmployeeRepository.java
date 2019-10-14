package com.mukit09.RedisLearning.repository;

import com.mukit09.RedisLearning.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findAll();
    List<Employee> findByAcc(String acc);
    List<Employee> findEmployeesByClient(String client);
}