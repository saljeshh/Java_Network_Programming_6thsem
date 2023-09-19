package urlchapter;

import java.net.*;

public class CreateURL {
     public static void main(String[] args) throws MalformedURLException{
        URL url = new URL("http://www.example.com/file/index.html");
        URL urlRelative = new URL(url,"/home.png");
        
        System.out.println(url);
        System.out.println(urlRelative);
        
    }
}
