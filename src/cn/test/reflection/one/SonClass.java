package cn.test.reflection.one;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/22
 */
public class SonClass extends FatherClass {
    private String mSonName;
    protected int mSonAge;
    public String mSonBirthday;

    public void printSonMsg() {
        System.out.println("Son Msg - name : "
                + mSonName + "; age : " + mSonAge);
    }

    private void setSonName(String name) {
        mSonName = name;
    }

    private void setSonAge(int age) {
        mSonAge = age;
    }

    private int getSonAge() {
        return mSonAge;
    }

    private String getSonName() {
        return mSonName;
    }

}
