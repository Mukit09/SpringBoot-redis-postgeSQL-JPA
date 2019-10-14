package com.mukit09.RedisLearning.service;

import com.mukit09.RedisLearning.entity.Employee;
import com.mukit09.RedisLearning.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Cacheable(value = "employeeCache", key = "#client")
    public List<Employee> getEmployeesByClient(String client) {
        log.debug("Inside of getEmployeeByClient");
        return repository.findEmployeesByClient(client);
    }

    @Cacheable(value = "employeeCache")
    public List<Employee> getAllEmployees() {
        log.debug("Inside of getAllEmployees");
        return repository.findAll();
    }
}
