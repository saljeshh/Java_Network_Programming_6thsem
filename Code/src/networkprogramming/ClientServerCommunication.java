/*
    client
 */
package networkprogramming;

import java.net.*;
import java.io.*;

public class ClientServerCommunication {
    public static void main(String[ ] args) throws Exception {
        Socket s = new Socket("localhost", 8080);
        
        DataInputStream din = new DataInputStream(s.getInputStream());
        
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = "", str2 = " ";
        
        while(!str.equals("stop")){
            System.out.println("Enter Response: ");
            str = br.readLine();
            dout.writeUTF(str);
            dout.flush();
            System.out.println("Waiting for server reply");
            str2 = din.readUTF();
            System.out.println("Server says " + str2);
        }
        
        din.close();
        s.close();
        
    }
}
