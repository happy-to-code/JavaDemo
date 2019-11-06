package cn.test.socket.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author
 */
public class Client {

    public static void main(String[] args) {
        Socket socket = null;
        try {
            //创建Socket, 请求服务端
            socket = new Socket("localhost", 18831);
            System.out.println("客户端已经连接上");
            while (true) {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintStream ps = new PrintStream(socket.getOutputStream());
                // 创建Scanner
                Scanner scanner = new Scanner(System.in);
                // 给出提示输入
                System.out.println("请输入一个字符串6:");
                // 从键盘输入读取一行
                String line = scanner.nextLine();
                //发送到服务端
                ps.println(line);
                ps.flush();
                if ((socket.getInputStream().available()) == 0) {
                    // 读取服务端发回的字符串, 打印
                    System.out.println(br.readLine());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}