package networkprogramming;
import java.net.*;

public class lab8 {
    public static void main(String[] args) {
        try{
            URL exm1 = new URL("http://www.example.com");
            URL exm2 = new URL("https://example.com");
            
            if(exm1.equals(exm2)){
                System.out.println(exm1 + " is same as " + exm2);
            }else{
                System.out.println(exm1 + " is not same as " + exm2);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
