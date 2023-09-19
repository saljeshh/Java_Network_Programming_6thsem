/*
wap in java that retrieve specific and arbitary http header fields
 */
package urlconnectionch5;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class HttpHeader {
    public static void main(String[] args) {
        
        try{
            // Create a URL object and connected to example.com
            URL url = new URL("http://www.example.com");
            
            // crate a httpurlconnection object for the url
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            // Extract and print the Request Method (Get, Post)
            System.out.println("Request Method: " + connection.getRequestMethod());
            
            // Extract and print the Response Code (e.g 200 OK, 400  Not Found, etc)
            System.out.println("Response Code: " + connection.getResponseCode());
            
            // Extract and print the Response Message (e.g OK, Not Found)
            System.out.println("Response Message: " + connection.getResponseMessage());
            
            // Extract and print the Content Type of the response
            System.out.println("Content Type: " + connection.getContentType());
            
            // Extract and print the Content Length of the response
            System.out.println("Content Length: " + connection.getContentLength());
            
            // Extract and print the Date of the response as a java.util.Date object
            System.out.println("Date: " + new Date(connection.getDate()));
            
            // Extract and print the Last Modified date of the resouce as a java.util.date object
            System.out.println("Last Modified: " + new Date(connection.getLastModified()));
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
