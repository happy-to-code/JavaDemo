package cn.test3.number;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/12/5
 */
public class Test {
    public static final short START_SYMBOL = 0x2323;
    public static final byte EXCEPTION_MARK = (byte) 0xFE;
    public static final byte INVALID_MARK = (byte) 0xFF;

    public static void main(String[] args) {
        //byte  [-128,127]

        // FE对应的10进制为：254   FF对应的10进制为：255
        System.out.println((byte) 254);
        System.out.println((byte) 255);

        System.out.println(START_SYMBOL);

        short i = 8995;
        if (i != START_SYMBOL) {
            System.out.println("=======12312312312313123======");
        }
        System.out.println(EXCEPTION_MARK);
        System.out.println(INVALID_MARK);
    }
}
