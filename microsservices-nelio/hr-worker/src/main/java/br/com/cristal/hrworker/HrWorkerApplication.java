package br.com.cristal.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="br.com.cristal")
@EnableEurekaClient
public class HrWorkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrWorkerApplication.class, args);
    }

}
