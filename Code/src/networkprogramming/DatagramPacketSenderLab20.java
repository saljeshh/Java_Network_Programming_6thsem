package networkprogramming;

import java.net.*;
import java.io.*;

// sender

public class DatagramPacketSenderLab20 {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        /*use to send/receive data*/
        String str = "HELLO THIS IS DATAGRAM PACKET";
        // str object that contains the message
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("127.0.0.1"), 1234);

        ds.send(dp);
        ds.close();
    }
}
