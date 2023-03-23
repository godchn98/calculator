package com.calculator.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueryStrings {
    private List<QueryString> queryStrings = new ArrayList<>();
    //"operand1=11 &operator=* &operand2=55"

    public QueryStrings(String queryStringLine ) {
        String[] queryStringTokens = queryStringLine.split("&");
        Arrays.stream(queryStringTokens)
                .forEach(queryString -> {
                    String[] value = queryString.split("=");
                    if(value.length != 2) {
                        throw new IllegalArgumentException("Wrong QueryString format");
                    }
                    queryStrings.add(new QueryString(value[0], value[1]));
                });
    }

    public String getValue(String key) {
        return this.queryStrings.stream()
                .filter(queryString -> queryString.exist(key))
                .map(QueryString::getValue)
                .findFirst()
                .orElse(null);
    }
}
