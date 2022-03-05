package com.example.qnavigation.service;

import com.example.qnavigation.bean.VehicleBean;
import com.example.qnavigation.dao.VehicleMapper;

public interface VehicleService {
    VehicleBean getVehicleById(int user_id);
}
