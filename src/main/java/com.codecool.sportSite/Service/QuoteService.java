package com.codecool.sportSite.Service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Service
public class QuoteService {
    private final String url = "https://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en";
    public Map<String, String> makeUrl() throws IOException{
        System.setProperty("http.agent", "Chrome");
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true);
        Map<String, String> myMap = mapper.readValue(new URL(url), HashMap.class);
        return myMap;
    }
}
