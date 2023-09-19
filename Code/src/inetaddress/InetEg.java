
package inetaddress;

import java.net.*;

public class InetEg {
     public static void main(String[] args) throws Exception {
        InetAddress adr = InetAddress.getLocalHost();
        //System.out.println(adr);
        System.out.println("canonical host name: " + adr.getCanonicalHostName());
        System.out.println("getHostName:  "+adr.getHostName());
        System.out.println("getHostAddress: "+adr.getHostAddress());
        System.out.println("getAddress: " + adr.getAddress());
       
        
        InetAddress address = InetAddress.getByName("chat.openai.com");
        //System.out.println(address);
        System.out.println(address.getCanonicalHostName());
        System.out.println(address.getHostName());
        
        
        InetAddress addr = InetAddress.getByName("8.8.8.8");
        System.out.println(addr.getCanonicalHostName());
        System.out.println(addr.getHostName());
        System.out.println(addr.getAddress());
        System.out.println(addr.getHostAddress());
        
    }
}
