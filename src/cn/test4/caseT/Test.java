package cn.test4.caseT;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/1/16
 */
public class Test {
    public static void main(String[] args) {
        int i = 1;
        switch (i){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                return;
            case 3:
                System.out.println("3");
                return;
        }

    }
}
