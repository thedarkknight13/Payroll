package com.tanyamakuwekuwe.payroll.util;

import com.tanyamakuwekuwe.payroll.models.Employee;
import com.tanyamakuwekuwe.payroll.models.Order;
import com.tanyamakuwekuwe.payroll.repositories.EmployeeRepository;
import com.tanyamakuwekuwe.payroll.repositories.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository,
                                   OrderRepository orderRepository) {

        return args -> {
            employeeRepository.save(new Employee("Bilbo", "Baggins", "burglar"));
            employeeRepository.save(new Employee("Frodo", "Baggins", "thief"));

            employeeRepository.findAll().forEach(employee -> log.info("Preloaded: " + employee));

            orderRepository.save(new Order("MacBook Pro", Status.CANCELLED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));
            orderRepository.save(new Order("HP Probook", Status.COMPLETED));

            orderRepository.findAll().forEach(order -> log.info("Preloaded" + order));
        };
    }
}
