/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package azienda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author informatica
 */
public class Azienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame frame =new Frame();
        frame.show();

//        try {
//
//		URL url = new URL("http://localhost:8080/api/tutorial/1.0/employees");
//		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//		conn.setRequestMethod("GET");
//		conn.setRequestProperty("Accept", "application/json");
//
//		if (conn.getResponseCode() != 200) {
//			throw new RuntimeException("Failed : HTTP error code : "
//					+ conn.getResponseCode());
//		}
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(
//			(conn.getInputStream())));
//
//		String output;
//		System.out.println("Output from Server .... \n");
//		while ((output = br.readLine()) != null) {
//			System.out.println(output);
//		}
//
//		conn.disconnect();
//
//	  } catch (MalformedURLException e) {
//
//		e.printStackTrace();
//
//	  } catch (IOException e) {
//
//		e.printStackTrace();
//
//	  }
    }
    
}
