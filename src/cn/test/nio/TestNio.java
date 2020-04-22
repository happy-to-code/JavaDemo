package cn.test.nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/28
 */
public class TestNio {
    public static void main(String[] args) throws IOException {
        // 第一步是获取通道。我们从 FileInputStream 获取通道：
        FileInputStream fin = new FileInputStream("D:\\readandshow.txt");
        FileChannel fc = fin.getChannel();
        // 下一步是创建缓冲区：
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        // 最后，需要将数据从通道读到缓冲区中
        System.out.println(buffer);
        fc.read(buffer);
    }
}
