package pl.krupop.m.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(value = "pl.krupop.m.controllers")
@EntityScan(value = "pl.krupop.m.*")
@EnableJpaRepositories("pl.krupop.m.dao")
public class EntryPoint {
    public static void main(String[] args) {
        SpringApplication.run(EntryPoint.class, args);
    }
}
