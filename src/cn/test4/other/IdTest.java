package cn.test4.other;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/1/7
 */
public class IdTest {
    public static void main(String[] args) {
        int number = 1;
        String id = String.format("%05d", number);
        System.out.println(id);

    }

    public static String getId(String type) {
        /*
        * 学员编号等级共3级：N、Y、D。
            N：诺亚第老学员，线上认证上线前的学员都属于老学员，
                如认证功能于2020年1月20日正式上线，则上课时间在2020年1月20前的学员都属于老学员，ID按N00001顺延。

            Y：诺亚第新学员，学员上课日期在线上认证功能日期以后的都属于新学员。ID按Y00001顺延。

            D：诺亚第全科学员，学习了诺亚第全科课程的学员按照D开头的ID顺延。D00001顺延。
        *
        * */
        // 00001
        int number = 1;
        String id = String.format("%06d", number);
        System.out.println(id);


        return null;
    }
}
