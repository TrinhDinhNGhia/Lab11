/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author nauq2
 */
public class TestURL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        URL url = new URL("https://www.youtube.com/watch?v=8ot0L3aywEE&ab_channel=Ph%C3%AAPhim");
        displayURL(url);
    }
    private static void displayURL(URL url)
    {
        System.out.println(" URL: "+url);
        System.out.printf(" Protocol: "+url.getProtocol());
        System.out.println(" Host: "+url.getHost());
        System.out.println(" Port: "+url.getPort());
        System.out.println(" Path: "+url.getPath());
        System.out.println(" Authority: "+url.getAuthority());
        System.out.println(" Query: "+url.getQuery());
        System.out.println(" User info: "+url.getUserInfo());
    }
    
}
