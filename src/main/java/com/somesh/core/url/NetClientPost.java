package com.somesh.core.url;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

public class NetClientPost {

	// http://localhost:8080/RESTfulExample/json/product/post
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();

	  try {

		URL url = new URL("https://ccrc-external-2.cisco.com/ServiceContract/ccrcdataservices/dataloader/getQuoteData");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");
		conn.setRequestProperty("Authorization", "0jY7mJ7Wxxgu0VS25JUhAIvAayIq");

		Set<String> input = new HashSet<>(); //"[\"281344802\",\"271343782\"}";
		input.add("281344802");
		String inputval = mapper.writeValueAsString(input);
		OutputStream os = conn.getOutputStream();
		os.write(inputval.getBytes());
		os.flush();

		/*if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
			throw new RuntimeException("Failed : HTTP error code : "
				+ conn.getResponseCode());
		}*/

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();

	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	 }

	}

}