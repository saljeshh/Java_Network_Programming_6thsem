/*
    wap to display the socket info(address, port, local address, local port)
 */
package networkprogramming;

import java.net.*;
import java.io.*;

public class lab16 {
    public static void main(String[] args) {
        String host = "www.google.com";
        
        try{
            Socket soc = new Socket(host, 443);
            
            System.out.println("Connected to " + soc.getInetAddress() + " on port " + soc.getPort() +
                    " From port " + soc.getLocalPort() + " of address " + soc.getLocalAddress());
            
            soc.close();
        }catch(UnknownHostException e){
            System.err.println("/ Can't find " + host);
        }catch(SocketException ex){
            System.err.println("Socket : "+ ex);
        }catch(Exception y){
            System.out.println(y);
        }
    }
}
