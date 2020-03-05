package cn.test4.dump;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/2/17
 */
public class User {
    private Long id;
    private String name;
    private Long age;

    public User(Long id, String name, Long age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public User() {
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

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
