package com.example.shop.mapper;

import com.example.shop.entity.Recent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RecentMapper {
  void addRecent(Recent recent);
  void updateRecent(Recent recent);
  Recent getRecentById(int sendId, int acceptId);
  List<Recent> getRecent(int uid);
}
