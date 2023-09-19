package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;


public class DaytimeUDPServer {
     public static void main(String[] args) {
        int port = 12345; // Choose a suitable port number

        try (DatagramSocket socket = new DatagramSocket(port)) {
            System.out.println("Daytime UDP server is listening on port " + port);

            while (true) {
                byte[] sendData = new Date().toString().getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length);

                // Receive incoming requests
                socket.receive(sendPacket);

                // Get client's address and port
                InetAddress clientAddress = sendPacket.getAddress();
                int clientPort = sendPacket.getPort();

                // Send the response
                DatagramPacket responsePacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                socket.send(responsePacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
