package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class PortScannerUDP {
     public static void main(String[] args) {
        String targetIP = "127.0.0.1"; // Replace with the target IP address
        int timeout = 1000; // Timeout in milliseconds

        for (int port = 1; port <= 1024; port++) {
            try (DatagramSocket socket = new DatagramSocket()) {
                socket.setSoTimeout(timeout);
                InetAddress targetAddress = InetAddress.getByName(targetIP);

                byte[] requestData = "Ping".getBytes(); // Adjust as needed

                DatagramPacket requestPacket = new DatagramPacket(requestData, requestData.length, targetAddress, port);
                socket.send(requestPacket);

                byte[] receiveBuffer = new byte[1024];
                DatagramPacket responsePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);

                socket.receive(responsePacket);
                System.out.println("Port " + port + " is open");
            } catch (Exception e) {
                // Port is likely closed or unreachable
                System.out.println("Port " + port + " is unreachable");
            }
        }
    }
}
