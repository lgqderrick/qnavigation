package com.example.qnavigation.service.impl;

import com.example.qnavigation.bean.VehicleBean;
import com.example.qnavigation.dao.VehicleMapper;
import com.example.qnavigation.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    public VehicleMapper vehicleMapper;
    @Override
    public VehicleBean getVehicleById(int user_id) {
        return vehicleMapper.queryVehicleById(user_id);
    }
}
