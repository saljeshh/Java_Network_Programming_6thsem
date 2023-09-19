package networkprogramming;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class Lab21receiver{
    public static void main(String[] args) throws Exception{
        DatagramChannel channel = DatagramChannel.open(); // open a datagramChannel for sending messages
        InetSocketAddress receiverAddress = new InetSocketAddress("localhost", 1234); // create the receiver address
        channel.bind(receiverAddress); // bind the channel to the receiver address

        ByteBuffer buffer = ByteBuffer.allocate(1024); // creat a bytebuffer to receive the incoming mesage

        channel.receive(buffer); // receive the message

        buffer.flip(); // prepare the buffer for reading

        byte[] receivedData = new byte[buffer.remaining()]; // create a byte array with the received data
        buffer.get(receivedData);

        String message = new String(receivedData); // convert the byte array to a string to extract the received message
        System.out.println("Received message: " + message); // print the received message
    }
}
