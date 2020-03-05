package cn.juc.reference;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/4 21:13
 */
public class People {
    /**
     * 名字
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;


    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
