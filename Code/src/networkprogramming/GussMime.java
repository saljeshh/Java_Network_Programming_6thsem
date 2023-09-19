package networkprogramming;

import java.net.*;
import java.io.*;

public class GussMime {
    public static void main(String[] args) {
        String fileName = "example.mp4";
        String contentType = URLConnection.guessContentTypeFromName(fileName);
        
        System.out.println("Content-Type: " + contentType);
        
    }
}
