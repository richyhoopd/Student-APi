package com.richyhoopd.apiDemo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@email.com",
                    LocalDate.of(2000, Month.JUNE, 13)
            );
            Student carlos = new Student(
                    "Carlos",
                    "carlitos@email.com",
                    LocalDate.of(1950, Month.FEBRUARY, 7)
            );

            repository.saveAll(
                    List.of(mariam, carlos)
            );
        };
    }
}
