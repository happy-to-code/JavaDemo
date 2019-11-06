package cn.test.map.day0710.test1.entity;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/7/10
 */
public class MobilelocationEntity {
    /**
     * 经度
     */
    private double lon;
    /**
     * 纬度
     */
    private double lat;

    public MobilelocationEntity(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public MobilelocationEntity setLon(double lon) {
        this.lon = lon;
        return this;
    }

    public double getLat() {
        return lat;
    }

    public MobilelocationEntity setLat(double lat) {
        this.lat = lat;
        return this;
    }
}
