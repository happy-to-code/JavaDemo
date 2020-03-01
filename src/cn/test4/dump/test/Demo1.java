package cn.test4.dump.test;

import cn.test4.dump.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/2/20
 */
public class Demo1 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(10);
        User user1 = new User(1L, "aa", 17L);
        User user3 = new User(3L, "cc", 19L);
        User user2 = new User(2L, "aa", 18L);
        users.add(user1);
        users.add(user3);
        users.add(user2);
        System.out.println(users);
        System.out.println("-------------");

        List<User> users1 = duplicateRemove(users);
        System.out.println(users1);

    }

    private static List<User> duplicateRemove(List<User> courseInfoDetailMiniVOS) {
        List<User> withOutDumps = new ArrayList<>(courseInfoDetailMiniVOS.size());

        List<String> courseNames = new ArrayList<>(courseInfoDetailMiniVOS.size());

        for (User vo : courseInfoDetailMiniVOS) {

            if (!courseNames.contains(vo.getName())) {
                courseNames.add(vo.getName());

                withOutDumps.add(vo);
            }
            // if (courseNames.size() <= 0) {
            //     courseNames.add(vo.getName());
            //
            //     withOutDumps.add(vo);
            //
            // } else {
            //     if (!courseNames.contains(vo.getName())) {
            //         courseNames.add(vo.getName());
            //
            //         withOutDumps.add(vo);
            //     }
            // }
        }

        return withOutDumps;
    }
}
