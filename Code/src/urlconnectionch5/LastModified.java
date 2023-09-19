// wap that uses the HEAD request method and print the last time a file on a server was modified

package urlconnectionch5;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Date;


public class LastModified {
    public static void main(String[] args) throws MalformedURLException, ProtocolException, IOException {
        URL u = new URL("https://southwestern.edu.np/wp-content/uploads/2022/06/IMG_1078-scaled.jpg");
        
        HttpURLConnection http = (HttpURLConnection) u.openConnection();
        http.setRequestMethod("HEAD");
        System.out.println(u + " was last modified at " + new Date(http.getLastModified()));
    }
}
