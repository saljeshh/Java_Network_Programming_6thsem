// To receive sendData.java
package chapter10;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveData {
    public static void main(String[] args) throws Exception{
        DatagramSocket soc = new DatagramSocket(3000);
        // created a datagram socket to receive data
        
        byte[] buf = new byte[1024];
        // created byte array but of length 1024 whta will be used to store data we received
        
        DatagramPacket dp = new DatagramPacket(buf,1024);
        // A new DatagramPacket obj is created with the buf byte array and a length of 1024. This obj will be used to receive incomming datagram.
        
        soc.receive(dp);
        // receive method is called on the datagramSocket object to wait for an incooming datagram. when a datagram is received, its data is stored in the buf byte array
        
        String str = new String(dp.getData(), 0, dp.getLength());
        // getData is called on the datagram packet object to gety the data from received datagram as a byte array. 
        // this byte array is then converted to a string using the string constructor that takes a byte array, an offest and a length as args.
        // The offset and length are used to specify which portion of the byte array to convert to a string.
        
        System.out.println(str);
        
       soc.close();
        
    }
}
