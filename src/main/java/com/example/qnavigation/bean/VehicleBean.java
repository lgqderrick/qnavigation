package com.example.qnavigation.bean;

import org.omg.CORBA.INTERNAL;

public class VehicleBean {
    int user_id;
    int vehicle_id;
    int size;
    int policy;
    double height;
    double width;
    double length;
    double weight;

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPolicy(int policy) {
        this.policy = policy;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public int getSize() {
        return size;
    }

    public int getPolicy() {
        return policy;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }
}