package cn.test.map.day0710.test1;

import cn.test.map.day0710.test1.entity.Enclosure;
import cn.test.map.day0710.test1.entity.MobilelocationEntity;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;


/**
 * @author lxg
 */
public class MapTools {
    /**
     * 判断当前位置是否在围栏内
     *
     * @param mobilelocationEntity
     * @param enclosureList
     * @return
     */
    public static boolean isInPolygon(MobilelocationEntity mobilelocationEntity, List<Enclosure> enclosureList) {
        double p_x = mobilelocationEntity.getLon();
        double p_y = mobilelocationEntity.getLat();
        Point2D.Double point = new Point2D.Double(p_x, p_y);

        List<Point2D.Double> pointList = new ArrayList<>(10);

        for (Enclosure enclosure : enclosureList) {
            double polygonPoint_x = enclosure.getLon();
            double polygonPoint_y = enclosure.getLat();
            Point2D.Double polygonPoint = new Point2D.Double(polygonPoint_x, polygonPoint_y);
            pointList.add(polygonPoint);
        }
        MapTools test = new MapTools();
        return test.checkWithJdkGeneralPath(point, pointList);
    }

    public static void main(String[] args) {
        List<Enclosure> enclosureList = new ArrayList<>(4);
        Enclosure e1 = new Enclosure(120.660097, 31.282069);
        Enclosure e2 = new Enclosure(120.770647, 31.280602);
        Enclosure e3 = new Enclosure(120.773394, 31.230415);
        Enclosure e4 = new Enclosure(120.677263, 31.21691);
        enclosureList.add(e1);
        enclosureList.add(e2);
        enclosureList.add(e3);
        enclosureList.add(e4);


        // 120.631582,31.315426
        MobilelocationEntity mobilelocationEntity1 = new MobilelocationEntity(120.666964, 31.275027);
        MobilelocationEntity mobilelocationEntity2 = new MobilelocationEntity(120.664904, 31.286177);
        MobilelocationEntity mobilelocationEntity3 = new MobilelocationEntity(120.726702, 31.217497);
        MobilelocationEntity mobilelocationEntity4 = new MobilelocationEntity(120.677263, 31.21691);
        MobilelocationEntity mobilelocationEntity5 = new MobilelocationEntity(120.629138, 31.318727);


        System.out.println(MapTools.isInPolygon(mobilelocationEntity1, enclosureList));
        System.out.println(MapTools.isInPolygon(mobilelocationEntity2, enclosureList));
        System.out.println(MapTools.isInPolygon(mobilelocationEntity3, enclosureList));
        System.out.println(MapTools.isInPolygon(mobilelocationEntity4, enclosureList));
        System.out.println(MapTools.isInPolygon(mobilelocationEntity5, enclosureList));

    }

    /**
     * 返回一个点是否在一个多边形区域内
     *
     * @param point
     * @param polygon
     * @return
     */
    private boolean checkWithJdkGeneralPath(Point2D.Double point, List<Point2D.Double> polygon) {
        java.awt.geom.GeneralPath p = new java.awt.geom.GeneralPath();

        Point2D.Double first = polygon.get(0);
        p.moveTo(first.x, first.y);
        polygon.remove(0);
        for (Point2D.Double d : polygon) {
            p.lineTo(d.x, d.y);
        }

        p.lineTo(first.x, first.y);

        p.closePath();

        return p.contains(point);

    }
}
