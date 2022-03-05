package com.example.qnavigation.controller;

import com.example.qnavigation.bean.VehicleBean;
import com.example.qnavigation.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @RequestMapping(value="/getVehicleById",method = RequestMethod.GET)
    private Map<String,Object> getVehicleById(int user_id){//Integer   @RequestParam("user_id")可不要
        Map<String,Object> modleMap=new HashMap<>();
        VehicleBean vehicle = vehicleService.getVehicleById(user_id);
        modleMap.put("vehicle",vehicle);
        return modleMap;
    }



}
