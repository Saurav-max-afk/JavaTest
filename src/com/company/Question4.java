package com.company;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Question4 {
    public static void main(String[] args) throws IOException,InterruptedException {

        var url="http://www.example.com/api/get/1";

        //httprequest

        var request= HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        var client= HttpClient.newBuilder().build();

        HttpResponse<String> response=client.send(request,HttpResponse.BodyHandlers.ofString());


        System.out.println(response.statusCode());
        System.out.println(response.body());


    }

}
