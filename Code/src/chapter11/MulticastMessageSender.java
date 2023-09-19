// wap that can send "hello" message to multi cast group where receiver should ready to receive the message to the port number where multicast socket is bound
package chapter11;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;


public class MulticastMessageSender {
    public static void main(String[] args) throws IOException {
        // open the multicast socket on port 3456
        MulticastSocket socket = new MulticastSocket();
        
        // address for the multicast group
        InetAddress group = InetAddress.getByName("225.4.5.6");
        
        // Create the multicast message and stored in message variable
        String msg = "Hello this is multicast program";
        
        // send the multicast packet to the multicast group
        DatagramPacket outPacket = new DatagramPacket(msg.getBytes(), msg.length(), group, 3456);
        
        socket.send(outPacket);
        socket.close();
    }
}
