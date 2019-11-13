package dez.steemit.com;

import java.io.*;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.nio.charset.StandardCharsets;

public class Wrapper {

   public static void main(String[] args) throws IOException, InterruptedException {

       String method = "getProfileStatus";

       //Method 2: java.net.http.HttpClient
       WebAPIWrapper w = new WebAPIWrapper("TOKEN_HERE");

       w.getSystemInfo();

   }


}





