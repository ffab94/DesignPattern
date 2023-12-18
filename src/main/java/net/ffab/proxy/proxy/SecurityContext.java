package net.ffab.proxy.proxy;

public class SecurityContext {
    public static String username="";
    public static String password="";
    public static String role="";

    public static void authenticate(String user, String passw, String r){
        username = user;
        password = passw;
        role = r;
    }
}
