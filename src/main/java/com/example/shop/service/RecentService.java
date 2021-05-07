package com.example.shop.service;

import com.example.shop.entity.Recent;
import com.example.shop.util.Result;

import java.util.List;

public interface RecentService {
    Result getRecent(int uid);
}
