
package urlchapter;

import java.net.URI;
import java.net.*;

public class URIDemo {
    public static void main(String[] args) {
        String baseURIString = "https://www.example.com/base";
        String relativeURIString = "/path/to/resource";
        
        try{
            URI baseURI = new URI(baseURIString); // parse the base uri
            URI relativeURI = new URI(relativeURIString); // parse the relative uri
            URI absoluteURI = baseURI.resolve(relativeURI); // resolve the relative uri against base uri
            String resolvedURIString = absoluteURI.toString(); // convert resolved uri to string
            System.out.println("Resolved URI: " + resolvedURIString); // print the resolved absoulte uri
            
        }catch(URISyntaxException e){
            e.printStackTrace();
        }
    }
}
