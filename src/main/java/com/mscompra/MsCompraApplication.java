package com.mscompra;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class MsCompraApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCompraApplication.class, args);
	}

}
