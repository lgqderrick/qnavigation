package com.example.qnavigation.bean;

public class Marker {
    int markerId;
    float latitude;
    float longitude;

    public int getMarkerId() {
        return markerId;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setMarkerId(int markerId) {
        this.markerId = markerId;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
