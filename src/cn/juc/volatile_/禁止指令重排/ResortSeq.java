package cn.juc.volatile_.禁止指令重排;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/2
 */
public class ResortSeq {
    int i = 0;
    boolean boo = false;

    void method1() {
        i = 1;       // 1
        boo = true;  // 2
    }

    /**
     * 多线程环境中线程交替执行,由于编译器优化重排的存在,
     * 两个线程使用的变量能否保持一致性是无法确定的,结果无法预测
     * =================
     * 正常情况下，method2打印出的数字是6，但是由于指令重排的原因，会小概率出现这种情况：
     * 先给boo = true赋值，还没来得及给i = 1赋值，
     * 然后就执行方法method2了，那么此时打印出的结果就是5
     */
    void method2() {
        if (boo) {
            System.out.println("******" + (5 + i));
        }
    }
}
