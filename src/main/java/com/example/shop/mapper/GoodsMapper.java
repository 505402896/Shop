package com.example.shop.mapper;

import com.example.shop.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsMapper {
  List<Goods> getAllGoods();  // 获取所有未售商品
}
