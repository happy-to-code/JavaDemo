package cn.test3.enums;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/7 14:58
 */
public enum WeekEnum {

    SUNDAY(0, "星期一"),
    MONDAY(1, "星期二"),
    TUESDAY(2, "星期三"),
    WEDNESDAY(3, "星期四"),
    THURSDAY(4, "星期五"),
    FRIDAY(5, "星期六"),
    SATURDAY(6, "星期天");

    /**
     * 下标
     */
    private Integer index;

    /**
     * des
     */
    private String des;

    WeekEnum(Integer index, String des) {
        this.index = index;
        this.des = des;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }


    public static WeekEnum getByIndex(int index) {
        WeekEnum[] weekEnums = WeekEnum.values();
        for (WeekEnum weekEnum : weekEnums) {
            if (weekEnum.index == index) {
                return weekEnum;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(getByIndex(0));
        System.out.println(getByIndex(0).getIndex());
        System.out.println(getByIndex(0).getDes());

        System.out.println(getByIndex(8));
    }

}
