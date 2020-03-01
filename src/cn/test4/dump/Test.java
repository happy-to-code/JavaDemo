package cn.test4.dump;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/2/17
 */
public class Test {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(10);
        User user1 = new User(1L, "aa", 17L);
        User user2 = new User(2L, "aa", 18L);
        User user3 = new User(3L, "cc", 19L);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        System.out.println(users);
        System.out.println("------------------------");
        List<User> users1111 = withOutDump(users);
        System.out.println(users1111 + "-----");

    }

    private static List<User> withOutDump(List<User> users) {
        List<User> userWithOutDump = new ArrayList(users.size());
        //用来临时存储用户的名称
        List<String> userNames = new ArrayList<>(10);

        List<User> userList = users.stream().filter(
                // 过滤去重
                v -> {
                    boolean flag = !userNames.contains(v.getName());
                    userNames.add(v.getName());
                    return flag;
                }
        ).collect(Collectors.toList());

        System.out.println("{}:" + userList);
        return userList;

    }
}
