// message app using socket and socket server
package chapter10;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MessageSocketReceiver {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 80);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String str = "", str2 = "";
        
        while(str != "stop"){
            System.out.println("Enter Request");
            str = reader.readLine();
            
            dout.writeUTF(str);
            dout.flush();
            
            System.out.println("Waiting for servers reply");
            str2 = din.readUTF();
            System.out.println("Server says: "  + str2);
            
            
        }
        
        dout.close();
        s.close();
    }
}
