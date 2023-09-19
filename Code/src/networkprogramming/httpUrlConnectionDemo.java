
package networkprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class httpUrlConnectionDemo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL u = new URL("http://www.example.com");
        URLConnection conn = u.openConnection();
        HttpURLConnection http = (HttpURLConnection) conn;
        
        InputStream stream  = http.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        
        String line;
        
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
        
        int s = http.getResponseCode();
        System.out.println(s);
        
        String msg = http.getResponseMessage();
        System.out.println(msg);
        
        boolean redirect = http.getFollowRedirects();
        System.out.println(redirect);
        
        reader.close();
    }
}
