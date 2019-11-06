package cn.test2.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/8/8
 */
public class Test {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("jack", 10));
        list.add(new Person("mike", 20));
        list.add(new Person("tom", 20));


        Person p = list.stream()
                .filter(person -> person.getAge() == 30)
                .findFirst()
                .orElse(null);


        System.out.println(p);
    }
}
