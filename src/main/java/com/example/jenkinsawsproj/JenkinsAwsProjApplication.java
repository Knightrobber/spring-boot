package com.example.jenkinsawsproj;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JenkinsAwsProjApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsAwsProjApplication.class, args);
    }
    @Bean
    public CommandLineRunner sampleData(Ride_Repository repository) {
        return (args) -> {
            repository.save(new Rides("Rollercoaster",3000));
            repository.save(new Rides("Jetpack joyride",5000));
            repository.save(new Rides("Subway Surfers",3500));
        };
    }
}
