package com.example.shop.service.Imp;

import com.example.shop.entity.Goods;
import com.example.shop.mapper.GoodsMapper;
import com.example.shop.service.GoodsService;
import com.example.shop.util.Common;
import com.example.shop.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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

  @Override
  public Result getGoodImg(@RequestParam(value = "file") MultipartFile file) {
    String fileName = file.getOriginalFilename();
    Result result = new Result();
    String filePath = Common.imgPath;
    try {
      Common.uploadFile(file.getBytes(),filePath,fileName);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      result.setCode(200);
      result.setMessage("操作成功");
    }
    return result;
  }

  @Override
  public Result getGoodsInfo(Goods goods) {
    Result result = new Result();
    goodsMapper.addGoods(goods);
    result.setMessage("新增成功");
    result.setCode(200);
    result.setData(goods);
    return result;
  }

  @Override
  public Result getGoodsById(int gid) {
    Result result = new Result();
    Goods goods = goodsMapper.getGoodsById(gid);
    result.setCode(200);
    result.setMessage("查询成功");
    result.setData(goods);
    return result;
  }
}
