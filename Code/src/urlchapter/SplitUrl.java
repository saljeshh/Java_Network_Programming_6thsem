
package urlchapter;

import java.net.URL;

public class SplitUrl {
    
    public static void main(String[] args) {
        
        try{
            //Create a new URL object from the given URL String
            URL url = new URL("https://www.example.com:443/anything/thispage.html?param1=value1#here");
            
            System.out.println("Protocol: " + url.getProtocol() );
            System.out.println("Host: " + url.getHost() );
            System.out.println("Port: " + url.getPort() );
            System.out.println("Path: " + url.getPath() );
            System.out.println("Query: " + url.getQuery() );
            System.out.println("Fragment: " + url.getRef() );
            System.out.println("UserInfo: " + url.getUserInfo() );
            System.out.println("Authority: " + url.getAuthority() );
            System.out.println("File: " + url.getFile() );
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
