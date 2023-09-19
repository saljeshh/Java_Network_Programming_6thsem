package networkprogramming;
import java.net.*;
import java.io.*;

public class lab10  {
    public static void main(String[] args){
        String urlString = "https://www.saljeshmaharjan.com.np/images/logo.png";
        //command line arguments for url example.com
        
        try{
            URL url = new URL(urlString);
            // create a url object from the urlstring example
            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //created http URLConnection object for the url
            
            System.out.println("Request Method: "+connection.getRequestMethod());
            System.out.println("Response code: " + connection.getResponseCode());
            System.out.println("Response message: "+connection.getResponseMessage());
            System.out.println("Content Type: "+ connection.getContentType());
            System.out.println("Date: " + connection.getDate());
            System.out.println("lastModified " + connection.getLastModified());
            System.out.println("Content-encoding "  + connection.getContentEncoding());
            
            String lastModified = connection.getHeaderField("Last-Modified");
            System.out.println("Modified At: " + lastModified);
        }catch(Exception e){
            System.out.println(e);
        }
       
    }
 
}
