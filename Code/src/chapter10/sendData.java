// Write a simple UDP program for sending DatagramPacket("hello") using datagramSocket
package chapter10;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class sendData {
    public static void main(String[] args) throws Exception {
        // it creates a new datagram socket object named ds which is used to send and receive datagrams
        DatagramSocket ds = new DatagramSocket();
        
        String str  = "Message sent by Datagram Socket.";
        // creating a string to store message
        
        byte[] data = str.getBytes();
        // storing string in a byes of array and object call data
        
        DatagramPacket dp = new DatagramPacket(data,data.length, InetAddress.getByName("127.0.0.1"),3000);
        
        ds.send(dp);
        ds.close();
        
    }
}
