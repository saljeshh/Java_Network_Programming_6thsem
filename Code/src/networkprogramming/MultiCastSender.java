
package networkprogramming;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastSender {
    private static final String MULTICAST_GROUP = "224.0.0.1";
    private static final int PORT = 5000;

    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName(MULTICAST_GROUP);
            MulticastSocket socket = new MulticastSocket();

            String message = "Hello";
            byte[] buffer = message.getBytes();

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, group, PORT);

            // Send the multicast message
            socket.send(packet);
            System.out.println("Sent multicast message: " + message);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
