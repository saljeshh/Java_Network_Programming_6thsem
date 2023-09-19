/*
    Progeram for daytime client 5 marks
 */
package networkprogramming;

import java.net.*;
import java.io.*;

public class DayTimeClient{
    public static void main(String[] args) {
        String hostname = args.length > 0 ? args[0]: "time.nist.gov";
        Socket socket = null; // reserver word
        
        try{
            socket = new Socket(hostname, 13);
            socket.setSoTimeout(15000);
            //set socket timeoit
            InputStream in = socket.getInputStream();
            StringBuilder time = new StringBuilder();
            InputStreamReader reader = new InputStreamReader(in, "ASCII");
            
            // looping 
            for(int c = reader.read(); c!= -1; c=reader.read()){
                time.append((char)c);
            }
            System.out.println(time);
            
            socket.close();
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
