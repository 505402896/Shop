package com.example.shop.service.Imp;

import com.example.shop.entity.Recent;
import com.example.shop.entity.UserInfo;
import com.example.shop.mapper.RecentMapper;
import com.example.shop.mapper.UserInfoMapper;
import com.example.shop.service.RecentService;
import com.example.shop.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("RecentService")
public class RecentServiceImp implements RecentService {

    @Autowired
    public RecentMapper recentMapper;

    @Autowired
    public UserInfoMapper userInfoMapper;

    @Override
    public Result getRecent(int uid) {
        Result result = new Result();
        List<Recent> list = recentMapper.getRecent(uid);
        List<Map<String,Object>> data = new ArrayList<>();
        UserInfo userInfo = null;
        for (Recent recent : list) {
            Map<String,Object> map = new HashMap<>();
            map.put("rid", recent.getRid());
            map.put("sendId", recent.getSendId());
            map.put("acceptId", recent.getAcceptId());
            map.put("content", recent.getContent());
            map.put("updateTime", recent.getUpdateTime());
            if (recent.getSendId() == uid) {
                userInfo = userInfoMapper.getUserById(recent.getAcceptId());
                map.put("name", userInfo.getName());
            } else {
                userInfo = userInfoMapper.getUserById(recent.getSendId());
                map.put("name", userInfo.getName());
            }
            data.add(map);
        }
        result.setMessage("查询成功");
        result.setCode(200);
        result.setData(data);
        return result;
    }
}
