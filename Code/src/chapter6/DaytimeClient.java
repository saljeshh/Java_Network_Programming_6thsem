// Daytime client program in java
package chapter6;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class DaytimeClient {
    
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("time.nist.gov", 13);
            // create a new socket object and connect it to the specified hostname and port (13 is the standard daytime port)
            
            socket.setSoTimeout(15000); // set the sockets timeout to 15 second
            
            InputStream in = socket.getInputStream();
            // get an inputstream object from the socket
            
            InputStreamReader reader = new InputStreamReader(in);
           
           StringBuilder time = new StringBuilder();
           
           
           for (int c = reader.read(); c != -1; c = reader.read()){
               time.append((char) c);
           }
           
            System.out.println(time);
            
        }catch(Exception e){
            
        }
    }
    
}
