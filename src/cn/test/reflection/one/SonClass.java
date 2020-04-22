package cn.test.reflection.one;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/22
 */
public class SonClass extends FatherClass {
    public String mSonBirthday;
    protected int mSonAge;
    private String mSonName;

    public void printSonMsg() {
        System.out.println("Son Msg - name : "
                + mSonName + "; age : " + mSonAge);
    }

    private int getSonAge() {
        return mSonAge;
    }

    private void setSonAge(int age) {
        mSonAge = age;
    }

    private String getSonName() {
        return mSonName;
    }

    private void setSonName(String name) {
        mSonName = name;
    }

}
