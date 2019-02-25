package com.somesh.udpexample;

import java.io.IOException;
import java.nio.charset.Charset;


public class MetricClient {
	
	private static final Charset STATS_D_ENCODING = Charset.forName("UTF-8");
	
	public MetricClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		NonBlockingUdpMetricsSender sender = new NonBlockingUdpMetricsSender("localhost", 8125, STATS_D_ENCODING);
		//NonBlockingUdpMetricsSender sender = new NonBlockingUdpMetricsSender("171.70.168.183", 8125, STATS_D_ENCODING);
		for(int i =0 ; i<500; i++){
			sender.send("lt.com.cisco.somesh.Test1:"+i+"|g");
		}
		System.out.println("done");
	}

}
