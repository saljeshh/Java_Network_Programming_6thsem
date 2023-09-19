
package networkprogramming;

import java.net.*;


public class lab7 {
    public static void main(String[] args) {
        try{
            String urlString = "https://www.ecample.com:443/anytheing/thispage.html?param1=value1#here";
            URL url = new URL(urlString);
            String protocol = url.getProtocol();
            String query = url.getQuery();
            System.out.println(protocol);
            System.out.println(query);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
