package reza.job.assess.capgemini.fintechapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication(exclude = {
		SecurityAutoConfiguration.class
})
public class FintechappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FintechappApplication.class, args);
	}

}
