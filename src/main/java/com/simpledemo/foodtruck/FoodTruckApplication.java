package com.simpledemo.foodtruck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Stack;

@SpringBootApplication
public class FoodTruckApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodTruckApplication.class, args);
	}

	@Bean
	public List<FoodTruck> foodTruckList() throws FileNotFoundException {
		return new FoodTruckDataLoader("Mobile_Food_Facility_Permit.csv").load();
	}

}
