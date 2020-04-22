package cn.test3.vin;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/12/12
 */
public class Str {
    public static void main(String[] args) {
        String str = "JSESSIONID=018C7B9F331B9E8B7226BB138AB24161;lastLoginedAt=1576128776000;lastLoginedIp=;lastLoginedShow=true;lastLoginedCity=;fr_remember=false;fr_password=;fr_username=zhangyifei_ms;";
        System.out.println(str);
        String substring = str.substring(0, str.lastIndexOf(";"));
        System.out.println(substring);

    }
}
