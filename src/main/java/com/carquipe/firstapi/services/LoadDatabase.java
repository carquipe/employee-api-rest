package com.carquipe.firstapi.services;

import lombok.extern.slf4j.Slf4j;

import com.carquipe.firstapi.model.Employee;
import com.carquipe.firstapi.model.EmployeeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
/* Lombok annotation to autocreate Slf4j based LoggerFactory as log */
@Slf4j
class LoadDatabase {
    /* Beans once the application context is loaded */
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        Employee data1 = new Employee("Bilbo Baggins", "burglar");
        Employee data2 = new Employee("Frodo Baggins", "thief");

        return args -> {
            log.info("Preloading " + repository.save(data1));
            log.info("Preloading " + repository.save(data2));
        };
    }

}
