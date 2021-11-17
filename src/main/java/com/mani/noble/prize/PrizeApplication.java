package com.mani.noble.prize;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PrizeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrizeApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public Filter myCustomFilter() {
		return (request, response, chain) -> {
			System.out.println("do Request Filtering ... ");
			try {
				chain.doFilter(request, response); // Do Response Filter after this
			} catch (Exception e) {
				System.out.println("Exception"+e.getMessage());
				throw e;
			}
			System.out.println("do Response Filtering ... ");
		};
	}

}
