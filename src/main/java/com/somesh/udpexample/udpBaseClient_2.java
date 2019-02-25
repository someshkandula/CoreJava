package com.somesh.udpexample;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner; 
  
public class udpBaseClient_2 
{ 
    public static void main(String args[]) throws IOException 
    { 
        Scanner sc = new Scanner(System.in); 
        int port = Integer.parseInt(args[0]);
  
        // Step 1:Create the socket object for 
        // carrying the data. 
        DatagramSocket ds = new DatagramSocket(); 
  
        InetAddress ip = InetAddress.getLocalHost(); 
        byte buf[] = null; 
  
        // loop while user not enters "bye" 
        while (true) 
        { 
            String inp = sc.nextLine(); 
  
            // convert the String input into the byte array. 
            buf = inp.getBytes(); 
  
            // Step 2 : Create the datagramPacket for sending 
            // the data. 
            DatagramPacket DpSend = 
                  new DatagramPacket(buf, buf.length, ip, port); 
  
            // Step 3 : invoke the send call to actually send 
            // the data. 
            ds.send(DpSend); 
  
            // break the loop if user enters "bye" 
            if (inp.equals("bye")) 
                break; 
        } 
    } 
} 