package io.javabrains.spring_cloud_confiq_sever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfiqSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfiqSeverApplication.class, args);
	}

}
