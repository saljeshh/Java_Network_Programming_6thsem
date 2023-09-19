// write a program using DatagramChannel sender and receiver
package chapter10;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannelSender {
    public static void main(String[] args) throws IOException{
        // open a datagramChannel for sending message
        DatagramChannel channel = DatagramChannel.open();
        
        // create the message to be sent
        String message = "Hello, Receiver";
        
        // wrap the mesage in a byteBuffer
        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
        
        // Create the receiver address
        InetSocketAddress receiverAddress = new InetSocketAddress("localhost",1234);
        
        // send the message to the reciever
        channel.send(buffer, receiverAddress);
        
        System.out.println("Message sent Successfully");
    }
}
