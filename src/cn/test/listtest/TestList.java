package cn.test.listtest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/5/23
 */
public class TestList {
    public static void main(String[] args) {
        List<Long> list1 = new ArrayList<>();
        list1.add(1L);
        list1.add(2L);
        list1.add(3L);
        list1.add(4L);
        list1.add(5L);

        List<Long> list2 = new ArrayList<>();
        list2.add(1L);
        // list2.add(2L);
        // list2.add(3L);
        list2.add(4L);
        list2.add(6L);


        List<Long> dealed = deal(list1, list2);
        System.out.println(dealed);
    }

    /**
     * 取出已处理的数据
     *
     * @param list1 表中存在的数据
     * @param list2 此数据是实时的
     * @return
     */
    public static List<Long> deal(List<Long> list1, List<Long> list2) {
        List<Long> handledList = new ArrayList<>(10);

        if (list1.size() <= 0) {
            return handledList;
        }
        if (list2.size() <= 0) {
            return list1;
        }


        a:
        for (Long info : list1) {
            //默认info在LongS已经存在
            Boolean isExists = true;
            if (list2 != null) {

                for (Long infoVO : list2) {
                    // 如果存在
                    if (info.equals(infoVO)) {
                        continue a;
                    }
                    isExists = false;
                }
            }
            if (!isExists) {
                handledList.add(info);
            }
        }

        return handledList;
    }
}
