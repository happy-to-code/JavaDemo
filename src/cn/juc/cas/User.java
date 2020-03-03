package cn.juc.cas;

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

    public User(String name, Long age) {
        this.name = name;
        this.age = age;
    }
}
