package cn.test3.str;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/12/24
 */
public class Test1 {
    public static void main(String[] args) {
        String teString = null;
        teString = String.valueOf(teString);
        System.out.println(teString);
        System.out.println("------------分割线---------------");

        boolean temp = false;
        String.valueOf(temp);

        char temp1 = 0;
        String.valueOf(temp1);

        double value = 0;
        String.valueOf(value);

        Object object = null;
        String.valueOf(object);

        float f = 0;
        String.valueOf(f);

        int i = 0;
        String.valueOf(i);

        long l = 0;
        String.valueOf(l);

        System.out.println("------------分割线---------------");

        //导致空指针
        char[] chars = null;
        // String.valueOf(chars);

        //导致空指针
        // String.valueOf(null, 0, 0);
    }
}
