package cn.test.hashcode;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2019/1/9
 */
public class TestHash {
    public static void main(String[] args) {
        Integer i = 100;
        int i1 = i.hashCode();
        String s = "hello";
        System.out.println("hashcode:"+i1);

        System.out.println("s:"+s.hashCode());
        System.out.println(s.hashCode() + 1);
        System.out.println("===================================");

        User user1 = new User(1L,"xiaoming",10,"男");
        User user2 = new User(2L,"xiaoming",10,"男");
        System.out.println("1:"+user1.hashCode());
        System.out.println("2:"+user2.hashCode());
    }
}
