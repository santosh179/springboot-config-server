package com.santosh.insuranceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
@RequestMapping("/insurance-service")
@EnableAutoConfiguration
public class InsuranceProviderApplication {

	@GetMapping("/getAllPlans")
	public List<String> getAllPlans(){
		return Stream.of("Premium","Gold","Platinum").collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(InsuranceProviderApplication.class, args);
	}

}
