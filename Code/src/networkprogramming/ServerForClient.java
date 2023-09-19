/*
    Server
 */
package networkprogramming;

import java.net.*;
import java.io.*;


public class ServerForClient {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(8080);
        
        Socket s = ss.accept();
        
        DataInputStream din = new DataInputStream(s.getInputStream());
        
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = "", str2 = "";
        
        while(str != "stop"){
            str = din.readUTF();
            System.out.println("Client :" + str);
            System.out.println("Enter message");
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        
        din.close();
        s.close();
        ss.close();
    }
}
