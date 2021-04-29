package com.example.shop.service.Imp;

import com.example.shop.entity.Order;
import com.example.shop.mapper.OrderMapper;
import com.example.shop.service.OrderService;
import com.example.shop.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("OrderService")
public class OrderServiceImp implements OrderService {

  @Autowired
  public OrderMapper orderMapper;
  @Override
  public Result getMyBuyOrder(int buyId) {
    Result result = new Result();
    List<Order> list = orderMapper.getMyBuyOrder(buyId);
    result.setMessage("查询成功");
    result.setCode(200);
    result.setData(list);
    return result;
  }
}
