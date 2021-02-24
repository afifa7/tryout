package com.ayanstrade;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main (String [] args) throws IOException {
        ServerSocket ss= new ServerSocket(4567);
        while(true) {
            Socket s = ss.accept();
            System.out.println("Connection Established..");
            //write or send OutputsStream
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.print("Greeting from Ayans soft");
            s.close();
        }
    }

}
