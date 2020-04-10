package cn.test5.sorts;

import java.util.Comparator;

public class TaskComparator_item_value implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Task task1 = (Task) o1;
        Task task2 = (Task) o2;

        if (task1.getName() != null && task2.getName() != null) {
            if (task1.getName().compareTo(task2.getName()) > 0) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return task1.getName() == null ? 1 : -1;
        }
    }
}  
