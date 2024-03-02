package com.simpledemo.foodtruck;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FoodTruckApplicationTests {

	@Resource
	List<FoodTruck> foodTruckList;

	@Test
	void contextLoads() {
		System.out.println(foodTruckList.size());
	}

}
