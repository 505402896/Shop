package com.example.shop.controller;

import com.example.shop.service.RecentService;
import com.example.shop.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/recent")
public class RecentController {

  @Autowired
  public RecentService recentService;

  @RequestMapping(value = "/getRecent",method = RequestMethod.GET)
  public Result getRecent(int uid) {
    return recentService.getRecent(uid);
  }
}
