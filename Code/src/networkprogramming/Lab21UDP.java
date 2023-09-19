package networkprogramming;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

// sender side


public class Lab21UDP {
    public static void main(String[] args) throws Exception{
        DatagramChannel channel = DatagramChannel.open(); // open a datagram channel for sending
        String message = "Hello, Recevier"; // create the message to be sent
        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());// wrap the message in a bytebuffer

        InetSocketAddress receiverAddress = new InetSocketAddress("localhost", 1234);// create the receiver address

        channel.send(buffer, receiverAddress); // send the message to the receiver

        System.out.println("Message sent successfully");
    }
}
