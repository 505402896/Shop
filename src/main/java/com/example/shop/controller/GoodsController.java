package com.example.shop.controller;

import com.example.shop.service.GoodsService;
import com.example.shop.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/goods")
public class GoodsController {

  @Autowired
  public GoodsService goodsService;

  @RequestMapping(value = "/getAllGoods",method = RequestMethod.GET)
  public Result getAllGoods() {
    return goodsService.getAllGoods();
  }
}
