/*
    wap in java that connects a url and reading data from it using openConnection() and getInputStream() method.
 */
package urlchapter;

import java.net.*;
import java.io.*;

public class ConnetUrlReadData {
    public static void main(String[] args) {
        try{
            //create a url object that access specified url
            URL url = new URL("https://www.saljeshmaharjan.com.np");
            
            //Open a connection to the given url
            URLConnection urlConnection = url.openConnection();
            
            //Get the input stream from the URL connection which we use to read data from the resources
            InputStream inputStream = urlConnection.getInputStream();
            
            //Create a BufferedReader object reader to read the data form input stream
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            
            //Read the data from the input stream and print it to the console
            String inputLine; // declare a variable inputLine
            
            //Reads line from file until there are no more files
            while((inputLine = reader.readLine()) != null){
                System.out.println(inputLine); // print each line
            }
            
            
            //close the input stream and the connection
            reader.close();
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
