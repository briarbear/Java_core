package io_model;
import java.io.*;
import java.net.*;
/**
 * 客户端
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-08 15:55
 */
public class Client {

    public static void main(String[] args) throws IOException {
        //客户端请求tcp连接
        Socket client = new Socket("127.0.0.1",60);
        client.setSoTimeout(10000);

        //获取键盘输入
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //获取Socket输出流，用来发送数据到服务器端
        PrintStream out = new PrintStream(client.getOutputStream());
        //获取socket输入流，用来接受从服务器发送过来的数据
        BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));

        boolean flag = true;
        while (flag){
            System.out.println("输入信息");
            String str = input.readLine();
            //发送数据到服务器端
            out.println(str);
            if ("bye".equals(str)){
                flag = false;
            }else {
                String echo = buf.readLine();
                System.out.println(echo);
            }
        }

        input.close();
        if (client != null)
            client.close();

    }
}
