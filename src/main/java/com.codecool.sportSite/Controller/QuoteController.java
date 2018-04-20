package com.codecool.sportSite.Controller;

import com.codecool.sportSite.Service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class QuoteController {

    @Autowired
    QuoteService quoteService;

    @GetMapping(value = "/new-quote")
    public ResponseEntity getNewQuote() throws IOException{
        return new ResponseEntity<>(quoteService.makeUrl(), HttpStatus.OK);
    }

}
