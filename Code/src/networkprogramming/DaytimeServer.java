package networkprogramming;

import java.io.*;
import java.net.*;

public class DaytimeServer {
     public static void main(String[] args) {
        try {
            // Create a server socket
            ServerSocket serverSocket = new ServerSocket(1120);
            System.out.println("Daytime server started...");
            
            while (true) {
                // Accept client connection
                Socket clientSocket = serverSocket.accept();
                
                // Get the current date and time
                String dateTime = new java.util.Date().toString();
                
                // Send the date and time to the client
                OutputStreamWriter outputStream = new OutputStreamWriter(clientSocket.getOutputStream());
                outputStream.write(dateTime + "\r\n");
                outputStream.flush();
                
                // Close the client socket
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
