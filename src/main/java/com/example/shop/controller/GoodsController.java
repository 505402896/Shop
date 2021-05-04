package com.example.shop.controller;

import com.example.shop.entity.Goods;
import com.example.shop.service.GoodsService;
import com.example.shop.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

  @RequestMapping(value = "/getGoodImg",method = RequestMethod.POST)
  public Result getGoodImg(@RequestParam(value = "file") MultipartFile file) {
    return goodsService.getGoodImg(file);
  }

  @RequestMapping(value = "/getGoodsInfo",method = RequestMethod.POST)
  public Result getGoodsInfo(@RequestBody Goods goods) {
    return goodsService.getGoodsInfo(goods);
  }

  @RequestMapping(value = "/getGoodsById",method = RequestMethod.GET)
  public Result getGoodsById(int gid) {
    return goodsService.getGoodsById(gid);
  }
}
