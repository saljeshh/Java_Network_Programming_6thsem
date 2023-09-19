// lab 3 = Find the hostname(Canonical name) of the given address(8.8.8.8)
// canonical means one hostname has multiple address
package networkprogramming;
import java.net.*;

public class lab3_canonicalname {
    public static void main(String[] args) throws Exception {
        InetAddress addr = InetAddress.getByName("8.8.8.8");
        System.out.println(addr.getCanonicalHostName());
    }
}


