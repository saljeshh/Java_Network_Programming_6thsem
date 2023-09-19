/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlchapter;

import java.net.*;
import java.io.*;

public class OpenStremExampleURL {
    public static void main(String[] args) {
        try{
            URL u = new URL("http://www.tufohss.edu.np");
            InputStream in = u.openStream();
            int c;
            while((c = in.read()) != -1){
                System.out.println(c);
            }
            in.close();
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}
