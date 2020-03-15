package cn.juc.cas;

import java.util.Objects;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/3
 */
public class User {
    /**
     * 用户名
     */
    private String name;

    /**
     * 年龄
     */
    private Long age;

    public User(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
