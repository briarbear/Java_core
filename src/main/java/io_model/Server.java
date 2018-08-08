package io_model;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 阻塞I/O模型 服务器端
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-08 15:47
 */
public class Server {



    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(60);
        Socket client = null;
        boolean f = true;

        while (f){
            client = server.accept();
            System.out.println("客户端连接成功");
            //获取Socket的输出流，用来向客户端发送数据
            PrintStream out = new PrintStream(client.getOutputStream());
            //获取Socket的输入流，用来接收从客户端发送过来的数据
            BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
            boolean flag =true;
            while(flag){
                //接收从客户端发送过来的数据
                String str =  buf.readLine();
                if(str == null || "".equals(str)){
                    flag = false;
                }else{
                    if("bye".equals(str)){
                        flag = false;
                    }else{
                        //将接收到的字符串前面加上echo，发送到对应的客户端
                        out.println("echo:" + str);
                        System.out.println(str);
                    }
                }
            }
            out.close();
            client.close();

        }

    }

}
