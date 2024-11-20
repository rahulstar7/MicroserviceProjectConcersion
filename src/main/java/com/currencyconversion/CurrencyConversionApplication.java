package com.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.currencyconversion.client.CurrencyClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = {CurrencyClient.class})
public class CurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionApplication.class, args);
		System.out.println("Currency COnversion is up and running.......!");
	}

}
