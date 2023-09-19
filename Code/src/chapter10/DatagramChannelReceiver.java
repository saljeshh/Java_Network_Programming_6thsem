// receiver for datagram channel
package chapter10;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannelReceiver {
    public static void main(String[] args) throws Exception{
        // Open a datagramChannel for receiving message
        DatagramChannel channel = DatagramChannel.open();
        
        // create the receiver address
        InetSocketAddress receiverAddress = new InetSocketAddress("localhost",1234);
        
        // Bind the channel to the receiver address
        channel.bind(receiverAddress);
        
        // create a bytebuffer to receive the incomming message
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        
        // receive the mesasge
        channel.receive(buffer);
        
        // prepare the buffer for reading
        buffer.flip();
        
        // create a byte array with the received data 
       byte[] receivedData = new byte[buffer.remaining()];
       buffer.get(receivedData);
       
       // Convert the byte array to a string to extract the received message
       String message = new String(receivedData);
       
        System.out.println("Received message: " + message);
    }
}
