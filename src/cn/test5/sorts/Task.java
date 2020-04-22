package cn.test5.sorts;

import java.util.Date;
import java.util.StringJoiner;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/2 15:52
 */
public class Task {
    private Long id;
    private String name;
    private Integer sortPriority;

    private Date date;

    public Task(Long id, String name, Integer sortPriority, Date date) {
        this.id = id;
        this.name = name;
        this.sortPriority = sortPriority;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSortPriority() {
        return sortPriority;
    }

    public void setSortPriority(Integer sortPriority) {
        this.sortPriority = sortPriority;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Task.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("sortPriority=" + sortPriority)
                .add("date=" + date)
                .toString();
    }
}
