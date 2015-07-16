package pl.krupop.m.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "pl.krupop.m.controllers")
public class EntryPoint {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(EntryPoint.class, args);
    }
}
