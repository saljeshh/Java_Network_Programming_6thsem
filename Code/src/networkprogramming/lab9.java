//package networkprogramming;
//import java.net.*;
//
//public class lab9 implements CookiePolicy{
//
//    @Override
//    public boolean shouldAccept(URI uri, HttpCookie cookie){
//        try{
//            
//            if(uri.getHost().endsWith(".gov") && cookie.getDomain().endsWith(".gov")){
//                returns false;
//            }else{
//                returns true;
//            }
//            
//        }catch(Exception e){
//            System.out.println("Error " + e);
//        } 
//    }
//    
//    
//    public static void main(String[] args) {
//       String uri = "https://www.geeksforgeeks.org/overriding-in-java/";
//        
//       lab9 object =  new lab9();
//       object.shouldAccept(uri, cookie);
//    }
//}