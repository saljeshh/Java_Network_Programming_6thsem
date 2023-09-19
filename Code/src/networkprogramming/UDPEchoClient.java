
package networkprogramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPEchoClient {
     private static final String SERVER_IP = "127.0.0.1"; // Replace with the server IP address
    private static final int SERVER_PORT = 5000;
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();

            // Send multiple echo requests
            for (int i = 1; i <= 5; i++) {
                String message = "Echo request " + i;
                byte[] buffer = message.getBytes();

                InetAddress serverAddress = InetAddress.getByName(SERVER_IP);
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, serverAddress, SERVER_PORT);

                // Send the request to the server
                socket.send(packet);
                System.out.println("Sent to server: " + message);

                byte[] responseBuffer = new byte[BUFFER_SIZE];
                DatagramPacket responsePacket = new DatagramPacket(responseBuffer, BUFFER_SIZE);

                // Receive the response from the server
                socket.receive(responsePacket);
                String response = new String(responsePacket.getData(), 0, responsePacket.getLength());

                System.out.println("Received from server: " + response);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
