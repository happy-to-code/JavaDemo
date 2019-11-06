package cn.test.map.day0710.test2.yuan;

/**
 * @Describle: 这个是判断圆形的方法
 * @Author: zhangyifei
 * @Date: 2019/7/10
 */
public class TestRad {
    private static double EARTH_RADIUS = 6378.137;

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    /**
     * 通过经纬度获取距离(单位：米)
     *
     * @param lat1
     * @param lng1
     * @param lat2
     * @param lng2
     * @return
     */
    public static double getDistance(double lat1, double lng1, double lat2, double lng2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) +
                Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000d) / 10000d;
        return s;
    }

    /**
     * 判断一个点是否在圆形区域内
     */
    public static boolean isInCircle(double lng1, double lat1, double lng2, double lat2, String radius) {
        double distance = getDistance(lat1, lng1, lat2, lng2);
        double r = Double.parseDouble(radius);
        if (distance > r) {
            return false;
        } else {
            return true;
        }
    }
}
