package com.bix.assesment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssessmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssessmentApplication.class, args);
    }

   /* @Bean
    CommandLineRunner run(AgentRepository agentRepository){
        return args ->{
            agentRepository.save(new Agent());
        };
    }*/

}
