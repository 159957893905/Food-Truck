package com.simpledemo.foodtruck;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于从csv文件中加载食品车信息
 * @author lid
 */
public class FoodTruckDataLoader {

    private String fileUrl = "";

    public FoodTruckDataLoader(String fileUrl){
        this.fileUrl = fileUrl;
    }

    /**
     * 从resources目录读取指定csv文件,默认最大读500条
     * @return 食品车列表
     */
    public List<FoodTruck> load() {
        List<FoodTruck> foodTruckList = new ArrayList<FoodTruck>(500);
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(fileUrl);
        EasyExcel.read(inputStream, FoodTruck.class, new PageReadListener<FoodTruck>(dataList -> {
            foodTruckList.addAll(dataList);
        }, 500)).sheet().doRead();
        return foodTruckList;
    }

}
