package com.example.BTM_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.example.BTM_backend.repository.*;

@SpringBootApplication
@EnableJpaAuditing

@EnableJpaRepositories(basePackageClasses = TalentsRepository.class)

public class BtmBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BtmBackendApplication.class, args);
    }

}
