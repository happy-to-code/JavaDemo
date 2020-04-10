package cn.test5.sorts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/1 16:16
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        List<Task> list = new ArrayList<>(10);
        Task task1 = new Task(1L, "LV10", 5, sdf.parse("2020-04-07 23:59:59"));
        Task task2 = new Task(2L, "LV40", 4, sdf.parse("2020-05-07 23:59:59"));
        Task task3 = new Task(3L, "LV20", 2, sdf.parse("2020-06-07 23:59:59"));
        Task task4 = new Task(4L, "LV50", 1, null);
        Task task5 = new Task(5L, "LV30", 32, sdf.parse("2020-04-07 23:59:59"));
        Task task6 = new Task(6L, null, 23, sdf.parse("2020-04-07 22:59:59"));
        list.add(task1);
        list.add(task2);
        list.add(task3);
        list.add(task4);
        list.add(task5);
        list.add(task6);

        System.out.println("list = " + list);

        Collections.sort(list, new TaskComparator_item_value());
        System.out.println("list = " + list);

        // TransObj transObj = new TransObj();
        // transObj.setTaskLists(list);
        // System.out.println("transObj = " + transObj);

    }
}
