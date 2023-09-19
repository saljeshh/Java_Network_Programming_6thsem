package networkprogramming;

import java.net.*;
import java.io.*;

public class DatagramPacketReceiverLab20 {
    public static void main(String[] args) throws Exception{

        DatagramSocket dsocket = new DatagramSocket(1234);
        byte[] buf = new byte[1024];
        // create a byte array of length 1024 which is used to store data
        DatagramPacket dpacket = new DatagramPacket(buf, 1024);
        dsocket.receive(dpacket);
        // receive method is called on datagramSocket to wait for incomming data gram when received store in buf

        String str = new String(dpacket.getData(), 0, dpacket.getLength());

        System.out.println(str);
        dsocket.close();

    }
}
