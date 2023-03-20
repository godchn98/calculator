package com.calculator.calculator.calculator;

public class RequestLine {

    // "GET /calculate?operand1=11&operator=*&operand2=55 HTTP/1.1"
    private final String method; //GET
    private final String urlPath; ///calculate?operand1=11&operator=*&operand2=55 HTTP/1.1

    private String queryString;

    public RequestLine(String requestLine) {
        String[] tokens = requestLine.split(" ");
        this.method = tokens[0];
        String[] urlPathTokens = tokens[1].split("\\?");
        this.urlPath = urlPathTokens[0];

        if(urlPathTokens.length == 2) {
            this.queryString = urlPathTokens[1];
        }



    }
}
