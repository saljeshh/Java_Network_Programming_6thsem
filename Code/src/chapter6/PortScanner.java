package chapter6;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class PortScanner {
    public static void main(String[] args) {
      
        String localhost = "127.0.0.1";
        int startPort = 1;
        int endPort = 20;
        
        for(int port = startPort; port <= endPort; port++){
            try{
                Socket soc = new Socket(localhost, port);
                System.out.println("Port " + port + " is open");
                soc.close();
            }catch(Exception e){
                System.out.println("Port " + port + " is closed");
            }
        }
        
    }
}
