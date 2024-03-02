package com.simpledemo.foodtruck;

/**
 * FoodTruck实体类
 */
public class FoodTruck {

    /**
     * 食品手推车的地点ID。
     */
    private String locationid;

    /**
     * 申请人的名称或标识。
     */
    private String Applicant;

    /**
     * 食品手推车的设施类型。
     */
    private String FacilityType;

    /**
     * 连接信息或网络连接标识。
     */
    private String cnn;

    /**
     * 食品手推车的地点描述。
     */
    private String LocationDescription;

    /**
     * 食品手推车的地址。
     */
    private String Address;

    /**
     * 地块和编号的组合信息。
     */
    private String blocklot;

    /**
     * 地块编号。
     */
    private String block;

    /**
     * 地块上的编号。
     */
    private String lot;

    /**
     * 许可证信息或编号。
     */
    private String permit;

    /**
     * 食品手推车的状态（例如：待批准、已批准、拒绝等）。
     */
    private String Status;

    /**
     * 食品手推车提供的食品项目或种类。
     */
    private String FoodItems;

    /**
     * 食品手推车的X坐标（可能用于地图定位）。
     */
    private double X;

    /**
     * 食品手推车的Y坐标（可能用于地图定位）。
     */
    private double Y;

    /**
     * 食品手推车的纬度坐标（用于地理定位）。
     */
    private double Latitude;

    /**
     * 食品手推车的经度坐标（用于地理定位）。
     */
    private double Longitude;

    /**
     * 食品手推车的经营时间表或安排。
     */
    private String Schedule;

    /**
     * 特定日期或时间段内的营业小时。
     */
    private String dayshours;

    /**
     * 噪音投诉信息或状态。
     */
    private String NOISent;

    /**
     * 批准状态或标识（例如：已批准、未批准等）。
     */
    private String Approved;

    /**
     * 接收日期或时间。
     */
    private String Received;

    /**
     * 先前的许可证信息或编号。
     */
    private String PriorPermit;

    /**
     * 许可证的到期日期。
     */
    private String ExpirationDate;

    /**
     * 食品手推车的具体地点或名称。
     */
    private String Location;

    /**
     * 食品手推车所在的消防预防区编号。
     */
    private int FirePreventionDistricts;

    /**
     * 食品手推车所在的警察区编号。
     */
    private int PoliceDistricts;

    /**
     * 食品手推车所在的监管区编号。
     */
    private int SupervisorDistricts;

    /**
     * 食品手推车所在的邮政编码。
     */
    private int ZipCodes;

    /**
     * 食品手推车所在的旧邻里或社区名称。
     */
    private String NeighborhoodsOld;

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }

    public String getApplicant() {
        return Applicant;
    }

    public void setApplicant(String applicant) {
        Applicant = applicant;
    }

    public String getFacilityType() {
        return FacilityType;
    }

    public void setFacilityType(String facilityType) {
        FacilityType = facilityType;
    }

    public String getCnn() {
        return cnn;
    }

    public void setCnn(String cnn) {
        this.cnn = cnn;
    }

    public String getLocationDescription() {
        return LocationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        LocationDescription = locationDescription;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getBlocklot() {
        return blocklot;
    }

    public void setBlocklot(String blocklot) {
        this.blocklot = blocklot;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getFoodItems() {
        return FoodItems;
    }

    public void setFoodItems(String foodItems) {
        FoodItems = foodItems;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }

    public String getSchedule() {
        return Schedule;
    }

    public void setSchedule(String schedule) {
        Schedule = schedule;
    }

    public String getDayshours() {
        return dayshours;
    }

    public void setDayshours(String dayshours) {
        this.dayshours = dayshours;
    }

    public String getNOISent() {
        return NOISent;
    }

    public void setNOISent(String NOISent) {
        this.NOISent = NOISent;
    }

    public String getApproved() {
        return Approved;
    }

    public void setApproved(String approved) {
        Approved = approved;
    }

    public String getReceived() {
        return Received;
    }

    public void setReceived(String received) {
        Received = received;
    }

    public String getPriorPermit() {
        return PriorPermit;
    }

    public void setPriorPermit(String priorPermit) {
        PriorPermit = priorPermit;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        ExpirationDate = expirationDate;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getFirePreventionDistricts() {
        return FirePreventionDistricts;
    }

    public void setFirePreventionDistricts(int firePreventionDistricts) {
        FirePreventionDistricts = firePreventionDistricts;
    }

    public int getPoliceDistricts() {
        return PoliceDistricts;
    }

    public void setPoliceDistricts(int policeDistricts) {
        PoliceDistricts = policeDistricts;
    }

    public int getSupervisorDistricts() {
        return SupervisorDistricts;
    }

    public void setSupervisorDistricts(int supervisorDistricts) {
        SupervisorDistricts = supervisorDistricts;
    }

    public int getZipCodes() {
        return ZipCodes;
    }

    public void setZipCodes(int zipCodes) {
        ZipCodes = zipCodes;
    }

    public String getNeighborhoodsOld() {
        return NeighborhoodsOld;
    }

    public void setNeighborhoodsOld(String neighborhoodsOld) {
        NeighborhoodsOld = neighborhoodsOld;
    }
}