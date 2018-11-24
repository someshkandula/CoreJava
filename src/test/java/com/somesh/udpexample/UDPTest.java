package com.somesh.udpexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UDPTest {

	EchoClient client;

	@Before
	public void setup() throws SocketException, UnknownHostException {
		new EchoServer().start();
		client = new EchoClient();
	}

	@Test
	public void whenCanSendAndReceivePacket_thenCorrect() throws IOException {
		String echo = client.sendEcho("hello server");
		System.out.println("echo1 "+echo);
		assertEquals("hello server", echo);
		echo = client.sendEcho("server is working");
		System.out.println("echo2 "+echo);
		assertFalse(echo.equals("hello server"));
	}

	@After
	public void tearDown() throws IOException {
		client.sendEcho("end");
		client.close();
	}

}
