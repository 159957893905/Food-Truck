package com.simpledemo.foodtruck;

/**
 * FoodTruck视图
 */
public class FoodTruckVO {

    /**
     * 与当前定位距离，单位为公里。
     */
    private double distance;

    /**
     * 申请人的名称或标识。
     */
    private String applicant;

    /**
     * 食品手推车的纬度坐标（用于地理定位）。
     */
    private double latitude;

    /**
     * 食品手推车的经度坐标（用于地理定位）。
     */
    private double longitude;

    /**
     * 特定日期或时间段内的营业小时。
     */
    private String dayshours;

    /**
     * 食品手推车的设施类型。
     */
    private String facilityType;

    /**
     * 食品手推车的地址。
     */
    private String address;

    /**
     * 食品手推车提供的食品项目或种类。
     */
    private String foodItems;

    /**
     * 食品手推车的地点描述。
     */
    private String locationDescription;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDayshours() {
        return dayshours;
    }

    public void setDayshours(String dayshours) {
        this.dayshours = dayshours;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(String foodItems) {
        this.foodItems = foodItems;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }
}