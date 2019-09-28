package co.com.pureservice.msservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsserviceApplication.class, args);
	}

}
