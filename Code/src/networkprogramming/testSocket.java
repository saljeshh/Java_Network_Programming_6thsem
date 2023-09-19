/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkprogramming;

import java.net.*;
import java.io.*;

public class testSocket {
  public static void main(String[] args) {
        String host = "localhost";
        for(int i = 1; i<65535; i++){
            try{
                Socket s = new Socket(host, i);
                System.out.println("There is a server port "+i+" of "+host);
                s.close();
            }catch (UnknownHostException e){
         
            } catch (IOException e) {

            }
        }
    }       
}
