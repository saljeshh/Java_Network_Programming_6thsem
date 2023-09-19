package networkprogramming;

import java.net.ServerSocket;

public class lab18 {
    public static void main(String[] args){

         //if you port 0, constructor on a server socket it listens on unspecified port
        //ServerSocket srv = new ServerSocket(0);

        for(int i = 1; i <= 65535; i++){
            try{
                ServerSocket srv = new ServerSocket(i);
                System.out.println("This server " + srv +  " runs on port " + i);
            }catch(Exception e){
                System.out.println(e);
            }

        }

    }
}
