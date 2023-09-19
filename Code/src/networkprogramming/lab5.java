package networkprogramming;
import java.net.*;

public class lab5 {
    public static void main(String[] args) {
        try{
            InetAddress obj1 = InetAddress.getByName("www.saljeshmaharjan.com.np");
            InetAddress obj2 = InetAddress.getByName("www.shakyarohan.com.np");
            
            System.out.println(obj1);
            System.out.println(obj2);
            
            boolean result = obj1.equals(obj2);
            System.out.println(result);
        }catch(Exception e){
            System.out.println("Error 404");
        }
    }
}
