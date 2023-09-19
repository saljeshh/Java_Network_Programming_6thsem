// Wap to dispay the IPaddress and hostname of your local machine
package networkprogramming;
import java.net.*;

public class HostName{
    public static void main(String[] args) throws UnknownHostException {
        InetAddress me = InetAddress.getLocalHost();
        String dottedQuad = me.getHostAddress();
        String hostname = me.getHostName();
        System.out.println("My address is "+ dottedQuad);
        System.out.println("My HostName is " + hostname);
    }
}
