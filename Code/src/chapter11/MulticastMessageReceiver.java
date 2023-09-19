
package chapter11;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastMessageReceiver {
    public static void main(String[] args) throws IOException {
        // open the multicast socket on port 3456
        MulticastSocket socket = new MulticastSocket(3456);
        
        // join a multicast group by specifying the mulicast address
        InetAddress group = InetAddress.getByName("225.4.5.6");
        socket.joinGroup(group);
        
        // create a byte array to store incomming data max 1024 bits
        byte[] buffer = new byte[1024];
        
        // create a datagramPacket for receiving multicast packets
        DatagramPacket inPacket = new DatagramPacket(buffer, buffer.length);
        
        // receive a multicast packet
        socket.receive(inPacket);
        
        // convert the received data to a string and print in the console
        System.out.println(new String(buffer));
        
        socket.close();
    }
}
