
package networkprogramming;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastReceiver {
    private static final String MULTICAST_GROUP = "224.0.0.1";
    private static final int PORT = 5000;
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName(MULTICAST_GROUP);
            MulticastSocket socket = new MulticastSocket(PORT);
            socket.joinGroup(group);

            byte[] buffer = new byte[BUFFER_SIZE];
            DatagramPacket packet = new DatagramPacket(buffer, BUFFER_SIZE);

            // Receive the multicast message
            socket.receive(packet);

            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received multicast message: " + message);

            socket.leaveGroup(group);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
