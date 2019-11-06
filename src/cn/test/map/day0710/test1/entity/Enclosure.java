package cn.test.map.day0710.test1.entity;

/**
 * Copyright 2019 www.elementwin.com
 *
 * @author zhangyifei
 * @version v1.0
 * @Description:
 * @Date 2019-07-09
 */

public class Enclosure {
    /**
     * 经度
     */
    private double lon;
    /**
     * 纬度
     */
    private double lat;

    public Enclosure(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public Enclosure setLon(double lon) {
        this.lon = lon;
        return this;
    }

    public double getLat() {
        return lat;
    }

    public Enclosure setLat(double lat) {
        this.lat = lat;
        return this;
    }
}
