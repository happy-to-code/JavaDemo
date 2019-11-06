package cn.test.map.day0710.test3;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/7/10
 */
public class Test {
    /**
     * 判断该地理坐标是否在最大范围区域内
     *
     * @param pointLon 要判断的点的纵坐标
     * @param pointLat 要判断的点的横坐标
     * @param lon      指定区域的纵坐标组成的数组
     * @param lat      指定区域的横坐标组成的数组
     * @return
     */
    private static boolean isInMaxArea(double pointLon, double pointLat, double[] lon, double[] lat) {
        // 获取区域横纵坐标最大值和最小值
        double temp = 0.0;
        for (int i = 0; i < lon.length; i++) {
            for (int j = 0; j < lon.length - i - 1; j++) {
                if (lon[j] > lon[j + 1]) {
                    temp = lon[j];
                    lon[j] = lon[j + 1];
                    lon[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < lat.length; i++) {
            for (int j = 0; j < lat.length - i - 1; j++) {
                if (lat[j] > lat[j + 1]) {
                    temp = lat[j];
                    lat[j] = lat[j + 1];
                    lat[j + 1] = temp;
                }
            }
        }

        // 如果在最值组成的区域外，那肯定不在重点区域内
        if (pointLon < lon[0] || pointLon > lon[lon.length - 1] || pointLat < lat[0]
                || pointLat > lat[lat.length - 1]) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 判断坐标是否在重点区域内
     *
     * @param pointLon 要判断的点的纵坐标
     * @param pointLat 要判断的点的横坐标
     * @param lon      指定区域的纵坐标组成的数组
     * @param lat      指定区域的横坐标组成的数组
     * @return
     */
    private static boolean isInAccurateArea(double pointLon, double pointLat, double[] lon, double[] lat) {
        // 代表有几个点
        int vertexNum = lon.length;
        boolean result = false;

        for (int i = 0, j = vertexNum - 1; i < vertexNum; j = i++) {
            // 满足条件，与多边形相交一次，result布尔值取反一次，奇数个则在区域内
            if ((lon[i] > pointLon) != (lon[j] > pointLon)
                    && (pointLat < (lat[j] - lat[i]) * (pointLon - lon[i]) / (lon[j] - lon[i])
                    + lat[i])) {
                result = !result;
            }
        }
        return result;
    }
}
