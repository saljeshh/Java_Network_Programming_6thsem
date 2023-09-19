package networkprogramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
// server

public class lab19 {
    public static void main(String[] args) throws Exception{
        ServerSocket ss =new ServerSocket(8080);

        Socket s = ss.accept();

        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str2 = " ";

        while(str != "stop"){
            System.out.println("Waiting for client reply ....");

            str = din.readUTF();
            System.out.println("Client says: " + str);
            System.out.println("Enter message: ");
            str2 = reader.readLine();

            dout.writeUTF(str2);
            dout.flush();
        }

        din.close();
        s.close();
        ss.close();

    }
}
