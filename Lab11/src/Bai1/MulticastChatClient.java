/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.io.*;
import java.net.*;

/**
 *
 * @author nauq2
 */
public class MulticastChatClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int portnumber = 5000;
        if (args.length >= 1) {
            portnumber = Integer.parseInt(args[0]);
        }
        // Create a MulticastSocket
        MulticastSocket chatMulticastSocket = new MulticastSocket(portnumber);
        InetAddress group = InetAddress.getByName("225.4.5.6");
        // Joins a multicast group
        chatMulticastSocket.joinGroup(group);
        String msg = "";
        System.out.println("Type a message for the Server:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        msg = br.readLine();
        // Send the message to Multicast address
        DatagramPacket data = new DatagramPacket(msg.getBytes(), 0, msg.length(), group, portnumber);
        chatMulticastSocket.send(data);
        chatMulticastSocket.close();
    }
    
}
