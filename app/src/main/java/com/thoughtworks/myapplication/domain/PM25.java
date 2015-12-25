package com.thoughtworks.myapplication.domain;

import com.google.gson.annotations.SerializedName;

public class PM25 {
    @SerializedName("position_name")
    private String positionName;

    @SerializedName("quality")
    private String quality;

    @SerializedName("aqi")
    private String aqi;

    @SerializedName("pm2_5")
    private String pm25;

    @SerializedName("time_point")
    private String timePoint;

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String quality) {
        this.aqi = aqi;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String quality) {
        this.pm25 = pm25;
    }

    public String getTimePoint() {
        return timePoint;
    }

    public void setTimePoint(String quality) {
        this.timePoint = timePoint;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
