package com.calculator.calculator.calculator;

import com.calculator.calculator.QueryStrings;

import java.util.Objects;

public class RequestLine {

    // "GET /calculate?operand1=11&operator=*&operand2=55 HTTP/1.1"
    private final String method; //GET
    private final String urlPath; //calculate

    private QueryStrings queryString; //operand1=11&operator=*&operand2=55 HTTP/1.1

    public RequestLine(String method, String urlPath, String queryString) {
        this.method = method;
        this.urlPath = urlPath;
        this.queryString = new QueryStrings(queryString);
    }

    public RequestLine(String requestLine) {
        String[] tokens = requestLine.split(" ");
        this.method = tokens[0];
        String[] urlPathTokens = tokens[1].split("\\?");
        this.urlPath = urlPathTokens[0];

        if(urlPathTokens.length == 2) {
            this.queryString = new QueryStrings(urlPathTokens[1]);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RequestLine that)) return false;
        return Objects.equals(method, that.method) && Objects.equals(urlPath, that.urlPath) && Objects.equals(queryString, that.queryString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, urlPath, queryString);
    }

    public boolean isGetRequest() {
        return "GET".equals(this.method);
    }

    public boolean matchPath(String path) {
        return urlPath.equals(path);
    }

    public QueryStrings getQueryStrings() {
        return this.queryString;
    }
}
