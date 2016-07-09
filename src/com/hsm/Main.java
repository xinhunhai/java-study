package com.hsm;

import javax.swing.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket = serverSocket.accept();
            JOptionPane.showInputDialog(null, "有客户连接到了本机的12345端口");

        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
