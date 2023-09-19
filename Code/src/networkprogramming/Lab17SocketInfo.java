package networkprogramming;

// this is repeated in lab 16

import java.io.IOException;
import java.net.Socket;

public class Lab17SocketInfo {
    public static void main(String[] args) {
        try{
            Socket toSocket = new Socket("www.example.com",80);
            System.out.println("Connected to " + toSocket.getInetAddress()
                    + " on Port " + toSocket.getPort()
                    + " from port " + toSocket.getLocalPort()
                    + " of " + toSocket.getLocalAddress());

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
