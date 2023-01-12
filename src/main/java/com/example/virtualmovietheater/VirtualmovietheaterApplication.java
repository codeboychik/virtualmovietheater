package com.example.virtualmovietheater;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VirtualmovietheaterApplication {

    public static void main(String[] args) {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:postgresql://localhost:8090/postgres", "postgres", "postgres")
                .locations("classpath:migrations")
                .load();
        flyway.migrate();

        SpringApplication.run(VirtualmovietheaterApplication.class, args);
    }

}
