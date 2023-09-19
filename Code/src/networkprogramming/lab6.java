package networkprogramming;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class lab6 {
        public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.youtube.com/watch?v=44PvX0Yv368&ab_channel=CoreySchafer");
        /*create the url object that access url example.com*/
        
        URLConnection connection = url.openConnection();
        /*url connection object created named "connection" by using openConnection method*/
        
        InputStream stream = connection.getInputStream();
        /*Relative a inputStream from the connectino using getInputStream() method, which we use to read data form the URL resource*/
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        /*Created BufferReader object reader to read data from the input strem*/
        
        String line;
        /*declare a variable name "line" of type string */
        
        while((line = reader.readLine()) != null){
            /*Read line from the file until there are no more lines*/
            System.out.println(line);
            // print each line
        }      
        reader.close();
        // close the buffer reader to release resource       
    }
}
