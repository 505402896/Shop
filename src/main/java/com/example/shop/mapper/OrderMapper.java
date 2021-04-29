package com.example.shop.mapper;

import com.example.shop.entity.Order;

import java.util.List;

public interface OrderMapper {
  List<Order> getMyBuyOrder(int buyId); // 获取自己的全部订单(买入)
}
