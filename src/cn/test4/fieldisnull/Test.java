package cn.test4.fieldisnull;

import java.lang.reflect.Field;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/14 11:55
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException {
        WeworkAddRecordBO weworkAddRecordBO = new WeworkAddRecordBO();
        System.out.println("weworkAddRecordBO = " + weworkAddRecordBO);
        System.out.println(checkObjFieldIsNull(weworkAddRecordBO));
        weworkAddRecordBO.setBusinessType("12");
        System.out.println("weworkAddRecordBO = " + weworkAddRecordBO);
        System.out.println(checkObjFieldIsNull(weworkAddRecordBO));
    }

    public static boolean checkObjFieldIsNull(Object obj) throws IllegalAccessException {
        for (Field f : obj.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            System.out.println(f.get(obj));
            if (f.get(obj) != null && !f.get(obj).equals("") && !"null".equals(f.get(obj))) {
                return false;
            }
        }
        return true;
    }
}
