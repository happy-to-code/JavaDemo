package cn.test.reflection.one;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/22
 */
public class TestReflection {
    public static void main(String[] args) {
        printFields();

        // printMethods();
    }


    /**
     * 通过反射获取类的所有变量
     */
    private static void printFields() {
        //1.获取并输出类的名称
        Class mClass = SonClass.class;
        System.out.println("类的名称：" + mClass.getName());

        //2.1 获取所有 public 访问权限的变量
        // 包括本类声明的和从父类继承的
        // Field[] fields = mClass.getFields();

        //2.2 获取所有本类声明的变量（不问访问权限）
        Field[] fields = mClass.getDeclaredFields();

        //3.遍历变量并输出变量信息
        for (Field field : fields) {
            //获取访问权限并输出
            int modifiers = field.getModifiers();
            System.out.println(Modifier.toString(modifiers));
            //输出变量的类型及变量名 
            System.out.println(field.getType().getName() + "-|-|-|-" + field.getName());
        }
    }

    /**
     * 通过反射获取类的所有方法
     */
    private static void printMethods() {
        //1.获取并输出类的名称
        Class mClass = SonClass.class;
        System.out.println("类的名称：" + mClass.getName());

        //2.1 获取所有 public 访问权限的方法
        //包括自己声明和从父类继承的
        Method[] mMethods = mClass.getMethods();

        //2.2 获取所有本类的的方法（不问访问权限）
        //Method[] mMethods = mClass.getDeclaredMethods();

        //3.遍历所有方法
        for (Method method : mMethods) {
            //获取并输出方法的访问权限（Modifiers：修饰符）
            int modifiers = method.getModifiers();
            System.out.print(Modifier.toString(modifiers) + " ");
            //获取并输出方法的返回值类型
            Class returnType = method.getReturnType();
            System.out.print(returnType.getName() + "==" + method.getName() + "( ");
            //获取并输出方法的所有参数
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter :
                    parameters) {
                System.out.print(parameter.getType().getName() + "##" + parameter.getName() + ",");
            }
            //获取并输出方法抛出的异常
            Class[] exceptionTypes = method.getExceptionTypes();
            if (exceptionTypes.length == 0) {
                System.out.println(" )");
            } else {
                for (Class c : exceptionTypes) {
                    System.out.println(" ) throws "
                            + c.getName());
                }
            }
        }
    }
}
