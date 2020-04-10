package cn.test5.sorts;

import java.util.Comparator;

public class TaskComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Task task1 = (Task) o1;
        Task task2 = (Task) o2;

        if (task1.getSortPriority() > task2.getSortPriority()) {
            return 1;
        } else {
            return -1;
        }
    }
}  
