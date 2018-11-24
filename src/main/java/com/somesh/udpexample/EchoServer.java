package com.somesh.udpexample;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


/*
 * We create a global DatagramSocket which we will use throughout to send packets, a byte array to wrap our messages, and a status variable called running.

For simplicity, the server is extending Thread, so we can implement everything inside the run method.

Inside run, we create a while loop that just runs until running is changed to false by some error or a termination message from the client.

At the top of the loop, we instantiate a DatagramPacket to receive incoming messages.

Next, we call the receive method on the socket. This method blocks until a message arrives and it stores the message inside the byte array of the DatagramPacket passed to it.

After receiving the message, we retrieve the address and port of the client, since we are going to send the response
back.

Next, we create a DatagramPacket for sending a message to the client. Notice the difference in signature with the receiving packet. This one also requires address and port of the client we are sending the message to.

5. The Client
Now let’s roll out a simple client for this new server:
 */
public class EchoServer extends Thread {
 
    private DatagramSocket socket;
    private boolean running;
    private byte[] buf = new byte[256];
 
    public EchoServer() throws SocketException {
        socket = new DatagramSocket(4445);
    }
 
    public void run() {
        running = true;
 
        while (running) {
            DatagramPacket packet 
              = new DatagramPacket(buf, buf.length);
            try {
				socket.receive(packet);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             
            InetAddress address = packet.getAddress();
            int port = packet.getPort();
            packet = new DatagramPacket(buf, buf.length, address, port);
            String received 
              = new String(packet.getData(), 0, packet.getLength());
             
            if (received.equals("end")) {
                running = false;
                continue;
            }
            try {
				socket.send(packet);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        socket.close();
    }
}

