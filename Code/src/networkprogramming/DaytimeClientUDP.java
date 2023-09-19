
package networkprogramming;

import java.io.*;
import java.net.*;

public class DaytimeClientUDP {
    private static final int SERVER_PORT = 13; // Daytime server port

    public static void main(String[] args) {
        try {
            InetAddress serverAddress = InetAddress.getByName("time.nist.gov");

            // Create a UDP socket
            DatagramSocket socket = new DatagramSocket();

            // Send an empty request to the server
            byte[] requestData = new byte[1];
            DatagramPacket requestPacket = new DatagramPacket(requestData, requestData.length, serverAddress, SERVER_PORT);
            socket.send(requestPacket);

            // Receive the response from the server
            byte[] responseData = new byte[1024];
            DatagramPacket responsePacket = new DatagramPacket(responseData, responseData.length);
            socket.receive(responsePacket);

            // Display the response
            String response = new String(responsePacket.getData(), 0, responsePacket.getLength());
            System.out.println("Server response: " + response);

            // Close the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
