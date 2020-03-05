package cn.juc.reference;

/**
 * @Describle:测试引用
 * @Author: zhangyifei
 * @Date: 2020/3/4 21:12
 */
public class TestTransReference {

    public void cahngeValue1(int age) {
        age = 300;
    }

    public void changeValue2(People people) {
        people.setName("xxx");
    }

    public void changeValue3(String string) {
        string = "xx--xx";
    }

    public static void main(String[] args) {
        TestTransReference test = new TestTransReference();

        int age = 20;
        test.cahngeValue1(age);
        System.out.println("age = " + age);


        People people = new People("zhangSan");
        test.changeValue2(people);
        System.out.println("people的名称 = " + people.getName());

        String str = "abcdf";
        test.changeValue3(str);
        System.out.println("s = " + str);


    }

}
