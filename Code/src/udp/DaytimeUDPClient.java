package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class DaytimeUDPClient {
     public static void main(String[] args) {
        String serverAddress = "127.0.0.1"; // Change to the server's IP address
        int serverPort = 12345; // Change to the server's port number

        try (DatagramSocket socket = new DatagramSocket()) {
            InetAddress serverInetAddress = InetAddress.getByName(serverAddress);

            byte[] requestData = new byte[0]; // Empty request data

            DatagramPacket requestPacket = new DatagramPacket(requestData, requestData.length, serverInetAddress, serverPort);
            socket.send(requestPacket);

            byte[] receiveData = new byte[1024]; // Buffer for receiving data
            DatagramPacket responsePacket = new DatagramPacket(receiveData, receiveData.length);

            socket.receive(responsePacket);

            String response = new String(responsePacket.getData(), 0, responsePacket.getLength());
            System.out.println("Server response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
