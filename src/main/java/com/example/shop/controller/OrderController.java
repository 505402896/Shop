package com.example.shop.controller;

import com.example.shop.service.OrderService;
import com.example.shop.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/order")
public class OrderController {

  @Autowired
  public OrderService orderService;

  @RequestMapping(value = "/getMyBuyOrder",method = RequestMethod.GET)
  public Result getMyBuyOrder(int buyId) {
    return orderService.getMyBuyOrder(buyId);
  }
}
