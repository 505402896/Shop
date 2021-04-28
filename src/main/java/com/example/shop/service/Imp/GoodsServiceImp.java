package com.example.shop.service.Imp;

import com.example.shop.entity.Goods;
import com.example.shop.mapper.GoodsMapper;
import com.example.shop.service.GoodsService;
import com.example.shop.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("GoodsService")
public class GoodsServiceImp implements GoodsService {

  @Autowired
  public GoodsMapper goodsMapper;
  @Override
  public Result getAllGoods() {
    Result result = new Result();
    List<Goods> list = goodsMapper.getAllGoods();
    result.setCode(200);
    result.setMessage("查询成功");
    result.setData(list);
    return result;
  }
}
