import Taro from '@tarojs/taro';
import { useState, useEffect } from 'react';
import { ScrollView, View, Text, Button } from '@tarojs/components'
import './index.css';

// 定义食品车的类型（如果使用TypeScript，则可以使用interface）
interface FoodTruck {
  applicant: string;
  distance: number;
  latitude: number;
  longitude: number;
  dayshours: string;
  facilityType: string;
  address: string;
  foodItems: string;
  locationDescription: string;
}

const Index = () => {
  const [loading, setLoading] = useState(true);
  const [foodTrucks, setFoodTrucks] = useState<FoodTruck[]>([]);

  useEffect(() => {
    fetchFoodTrucks();
  }, []); // 空依赖数组确保只在组件挂载时执行一次

  const fetchFoodTrucks = async () => {
    try {
      const lat = 37 + Math.random();
      const lng = -122 - Math.random();
      const res = await Taro.request({
        url: `/api/foodTruck/findNearest?lat=${lat}&lng=${lng}&lim=20`,
      });
      if (res.data && Array.isArray(res.data)) {
        setFoodTrucks(res.data);
        setLoading(false);
      } else {
        // 处理API返回数据不符合预期的情况
        Taro.showToast({
          title: '数据格式不正确',
        });
      }
    } catch (error) {
      // 处理API请求失败的情况
      Taro.showToast({
        title: '载入远程数据错误',
      });
      console.error(error);
    }
  };

  if (loading) {
    return <View>Loading...</View>;
  }

  return (
    <ScrollView className="container">
      <Text className="title">The food truck closest to oneself</Text>
        <Button className="button" onClick={() => fetchFoodTrucks()}>Random refresh positioning</Button>
        <View className="list">
          {foodTrucks.map((truck, index) => (
            <View key={index} className="listItem">
              <Text className="itemTitle">{truck.applicant}</Text>
              <Text className="itemText">Distance: {truck.distance.toFixed(2)} km</Text>
              <Text className="itemText">Food Items: {truck.foodItems}</Text>
              <Text className="itemText">Business Hours: {truck.dayshours}</Text>
              <Text className="itemText">Facility Type: {truck.facilityType}</Text>
              <Text className="itemText">Address: {truck.address}</Text>
              <Text className="itemText">Location Description: {truck.locationDescription}</Text>
            </View>
          ))}
        </View>
    </ScrollView>
  );
};

export default Index;
