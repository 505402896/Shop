package com.example.shop.service;

import com.example.shop.entity.Goods;
import com.example.shop.util.Result;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface GoodsService {
  Result getAllGoods();
  Result getGoodImg(@RequestParam(value = "file") MultipartFile file);
  Result getGoodsInfo(Goods goods);
  Result getGoodsById(int gid);
}
