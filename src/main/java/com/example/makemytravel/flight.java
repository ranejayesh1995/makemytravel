package com.example.makemytravel;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight {
    @GetMapping("/flight")
    public String getData() {return  "Please book your flights from mmt kindly book ticket for New Delhi to anywhere at 20% discount" ; }
}