package com.simpledemo.foodtruck;

import com.simpledemo.foodtruck.util.GeoUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lid
 */
@Service
public class FoodTruckService {

    @Autowired
    List<FoodTruck> foodTruckList;

    public List<FoodTruckVO> findNearestFoodTrucks(double currentLatitude, double currentLongitude, int limit) {
        if (foodTruckList == null) {
            return new ArrayList<>();
        }

        // 计算出每个食品车与当前经纬度的距离
        List<FoodTruckVO> sortedFoodTrucks = foodTruckList.stream().map(foodTruck -> {
            FoodTruckVO foodTruckVO = new FoodTruckVO();
            foodTruckVO.setDistance(GeoUtils.calculateDistance(foodTruck.getLatitude(), foodTruck.getLongitude(), currentLatitude, currentLongitude));
            BeanUtils.copyProperties(foodTruck,foodTruckVO);
            return foodTruckVO;
        }).collect(Collectors.toList());

        // 使用自定义比较器按距离排序
        sortedFoodTrucks.sort(Comparator.comparingDouble(foodTruck -> {
            return foodTruck.getDistance();
        }));

        // 返回最近的20辆食品车（或少于20辆，如果列表中食品车数量不足）
        return sortedFoodTrucks.subList(0, Math.min(limit, sortedFoodTrucks.size()));
    }
}
