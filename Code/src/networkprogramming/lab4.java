package networkprogramming;
import java.net.*;


public class lab4 {
    public static void main(String[] args) {
        try{
            InetAddress ibiblio = InetAddress.getByName("www.ibilio.org");
            InetAddress helios = InetAddress.getByName("helios.ibilio.org");
            
            String hostAddress = helios.getHostAddress();
        System.out.println("HostAddress  "+ hostAddress);
            
            if(ibiblio.equals(helios)){
                System.out.println("same");
            }else{
                System.out.println("Not same");
            }
        }catch(Exception e){
            System.out.println("Host lookup failed");
        }
        
    }
}
