package cn.test5.sorts;

import java.util.List;
import java.util.StringJoiner;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/8 19:33
 */
public class TransObj {
    private List<Task> taskLists;


    public List<Task> getTaskLists() {
        return taskLists;
    }

    public void setTaskLists(List<Task> taskLists) {
        this.taskLists = taskLists;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TransObj.class.getSimpleName() + "[", "]")
                .add("taskLists=" + taskLists)
                .toString();
    }
}
