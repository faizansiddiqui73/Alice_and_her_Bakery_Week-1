package com.codingshuttle.com.faizan.SpringBoot_0_1_Alice_and_her_Bakery_Week_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot01AliceAndHerBakeryWeek1Application implements CommandLineRunner {

	@Autowired
	CakeBaker cakeBaker;
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot01AliceAndHerBakeryWeek1Application.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(cakeBaker.bakeCake());;
	}
}
