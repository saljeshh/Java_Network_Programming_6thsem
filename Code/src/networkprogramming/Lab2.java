package networkprogramming;
import java.net.*;

public class Lab2 {
    public static void main(String[] args) throws Exception {
        InetAddress adr = InetAddress.getLocalHost(); // created object name address
        System.out.println(adr);
        
        InetAddress address = InetAddress.getByName("www.saljeshmaharjan.com.np");
        System.out.println(address);
    }
}

