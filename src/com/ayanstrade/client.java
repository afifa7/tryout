package com.ayanstrade;


import java.io.IOException;
import java.net.Socket;


public class client {

    Socket s = new Socket("localhost",4567);


    public client() throws IOException {
    }
}

