package com.example.shop.mapper;

import com.example.shop.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsMapper {
  List<Goods> getAllGoods();  // 获取所有未售商品
  Goods getGoodsById(int gid);
  void addGoods(Goods goods);
  List<Goods> getGoodsByType(int type);
  List<Goods> getMyGoods(int uid);
  void delMyGoods(int gid);
  String queryImgPath(int gid);
}
