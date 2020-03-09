package cn.classload;

class SuperClass {
    static {
        System.out.println("superclass init");
    }

    public static int value = 123;
}

class SubClass extends SuperClass {
    static {
        System.out.println("subclass init");
    }
}

public class Test1 {
    public static void main(String[] args) {
        // 被动应用1
        // System.out.println(SubClass.value);
        // 被动引用2
        SubClass[] sca = new SubClass[10];
    }
}
