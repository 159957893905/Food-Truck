package com.simpledemo.foodtruck;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lid
 */
@RestController
@RequestMapping("/api/foodTruck")
public class FoodTruckController {

    @Autowired
    FoodTruckService foodTruckService;

    /**
     * 获取距离当前最近的食品车列表
     * @param latitude 纬度
     * @param longitude 经度
     * @param limit 获取条数,默认20条
     * @return 食品车列表
     */
    @GetMapping("/findNearest")
    public List<FoodTruckVO> findNearestFoodTrucks(@RequestParam("lat") double latitude,
                                                @RequestParam("lng") double longitude,
                                                @RequestParam(value = "lim", defaultValue = "20") int limit) {
        return foodTruckService.findNearestFoodTrucks(latitude, longitude, limit);
    }
}
