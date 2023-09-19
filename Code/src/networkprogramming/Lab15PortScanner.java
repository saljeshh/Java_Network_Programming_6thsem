/*
    Wap to find which of the first 1024 ports seems to be hosting the TCP server on a specified host.
 */
package networkprogramming;

import java.net.*;
import java.io.*;


public class Lab15PortScanner {
    public static void main(String[] args){
        String host = "localhost";
        
        for(int port = 1; port < 1024; port++){
            
            try{
                Socket s = new Socket(host,port);
            
                System.out.println("There is a server port: " + port + " of " + host);
                
                s.close();
               
            
            } catch(UnknownHostException e) {
                System.out.println("Unknown Host: " + host);
                break;
            } catch(IOException e){
                
            }
           
        }
                
         
    }
}
