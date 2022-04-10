package com.example.demodbauto;

import com.rdxer.db.auto.EnableDBAuto;
import com.rdxer.db.migration.EnableDBMigration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDBAuto
@EnableDBMigration
public class DemodbautoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemodbautoApplication.class, args);
    }

}
