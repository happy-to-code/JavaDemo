package cn.test5.sorts;

import java.util.Comparator;

public class TaskComparator_Date implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Task task1 = (Task) o1;
        Task task2 = (Task) o2;

        if (task1.getDate() != null && task2.getDate() != null) {
            if (task1.getDate().getTime() > task2.getDate().getTime()) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return task1.getDate() == null ? 1 : -1;
        }
    }
}  
