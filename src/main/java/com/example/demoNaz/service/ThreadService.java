package com.example.demoNaz.service;

import com.example.demoNaz.entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Slf4j
public class ThreadService implements Runnable {

    @Autowired
    private EmployeeService employeeService;

    public static boolean isRunning = true;

    @PostConstruct
    @Override
    public void run() {
        log.debug("Service Thread Started");
        while(isRunning) {
            log.debug("First line of thread");
//            List<Employee> employeeList = repository.findAll();
//            for(Employee employee : employeeList) {
//                log.debug(employee.getAcc() + "|" + employee.getClient() + "|" + employee.getId());
//            }

            List<Employee> employees = employeeService.getEmployeesByClient("FastVoiz");
            log.debug("Employee Size: " + employees.size());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                log.error("Exception: ", e);
            }
        }
    }
}
