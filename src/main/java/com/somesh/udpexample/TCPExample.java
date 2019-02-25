package com.somesh.udpexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPExample {

	public TCPExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GreetClient client = new GreetClient();
		System.out.println(" Start connection ");
		client.startConnection("127.0.0.1", 8096);
		System.out.println(" before push ");
	    String response = client.sendMessage("hello server");
	    System.out.println("Post message ");

	}

	static class GreetClient {
	    private Socket clientSocket;
	    private PrintWriter out;
	    private BufferedReader in;
	 
	    public void startConnection(String ip, int port) throws IOException {
	        clientSocket = new Socket(ip, port);
	        out = new PrintWriter(clientSocket.getOutputStream(), true);
	        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	    }
	 
	    public String sendMessage(String msg) throws IOException {
	        out.println(msg);
	        String resp = in.readLine();
	        return resp;
	    }
	 
	    public void stopConnection() throws IOException {
	        in.close();
	        out.close();
	        clientSocket.close();
	    }
	}
}
