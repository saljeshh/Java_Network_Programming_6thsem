// Wap to find the socket address info about localhost and remote host
package chapter6;

import java.net.Socket;

public class SocketInfo {
    public static void main(String[] args) {
        String remoteHost = "www.example.com";
        int remotePort = 80;
        
        try{
            
            Socket toSocket = new Socket(remoteHost,remotePort);
            
            System.out.println("Connected to " + toSocket.getInetAddress() + " on port " + toSocket.getPort() + " from " + toSocket.getLocalPort() + " of " + toSocket.getLocalAddress());
            
        }catch(Exception e){
            
        }
    }
}
