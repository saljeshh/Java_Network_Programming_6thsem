package cookie;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class CookieExample {
    
    public static void main(String[] args) {
        try{
            // create a cookie manager with a default cookiepolicy
            CookieManager cookieManager = new CookieManager();
            CookieHandler.setDefault(cookieManager);
            
            // Create a URLConnection and make a request
            URL url = new URL("http://www.example.com/");
            URLConnection connection = url.openConnection();
            connection.getContent();
            
            // Retrieve cokoies from the CookieStore
            CookieStore cookieStore = cookieManager.getCookieStore();
            List<HttpCookie> cookies = cookieStore.getCookies();
            
            //print the cookies
            for(HttpCookie cookie : cookies){
                System.out.println(cookie.getName() + "=" + cookie.getValue());
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }   
}
