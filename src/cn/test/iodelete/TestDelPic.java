package cn.test.iodelete;

import java.io.File;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/12
 */
public class TestDelPic {
    public static void main(String[] args) {
        File f = new File("d:\\1.png");
        boolean delete = f.delete();
        System.out.println(delete);
    }
}
