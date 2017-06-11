/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;

/**
 *
 * @author Matthew
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;

public class net {
    private static Scanner in;
    
    public static void main(String args[]) throws IOException{
        in = new Scanner(System.in);
        String fName = null;
        String lName = null;
        System.out.println("First Name: ");
        fName = in.next();
        
        System.out.println("Last Name: ");
        lName = in.next();
        
        String urlLink = "http://www.honorknowledgepower.com/java.php?fName="+fName+"&lName="+lName;
        URL url = new URL(urlLink);
        HttpURLConnection connect = (HttpURLConnection)url.openConnection();
        connect.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
        StringBuffer sb = new StringBuffer();
        String line;
        
        while((line = in.readLine()) != null){
            sb.append(line);
        }
        in.close();
        System.out.println(sb.toString());
    }
}
