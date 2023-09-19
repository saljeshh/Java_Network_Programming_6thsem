
package networkprogramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPEchoServer {
    private static final int PORT = 5000;
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(PORT);
            System.out.println("UDP Echo Server started on port " + PORT);

            while (true) {
                byte[] buffer = new byte[BUFFER_SIZE];
                DatagramPacket packet = new DatagramPacket(buffer, BUFFER_SIZE);

                // Receive request from client
                socket.receive(packet);

                // Process the request
                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received from client: " + message);

                // Send the response back to the client
                socket.send(packet);

                System.out.println("Sent back to client: " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
