// Wap in java that gues the mmie type from file extenstions


package urlconnectionch5;

import java.net.URLConnection;

public class MMIEType {
    public static void main(String[] args) {
        String contentType1 = URLConnection.guessContentTypeFromName("example.jpg");
        System.out.println(contentType1);
        
        String contentType2 = URLConnection.guessContentTypeFromName("example.mp4");
        System.out.println(contentType2);
        
        String contentType3 = URLConnection.guessContentTypeFromName("example.txt");
        System.out.println(contentType3);
        
        String contentType4 = URLConnection.guessContentTypeFromName("example.png");
        System.out.println(contentType4);
        
    }
}
