package cn.test.socket.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author
 */
public class Server {

    public static void main(String[] args) {
        Socket socket = null;
        ServerSocket serverSocket = null;
        try {
            while (true) {
                //创建绑定端口8000的对象ServerSocket
                serverSocket = new ServerSocket(18831);
                System.out.println("服务器已经启动");
                //接收客户端请求，得到Socket
                socket = serverSocket.accept();
                System.out.println("有客户端连接过来了");
                //创建带缓冲的字符读入流
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //读取一个文本行
                String sr = br.readLine();
                //此输出流不会抛出异常
                PrintStream ps = new PrintStream(socket.getOutputStream());
                //将反转后的字符串打印到客户端屏幕上
                ps.println(new StringBuffer(sr).reverse());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}