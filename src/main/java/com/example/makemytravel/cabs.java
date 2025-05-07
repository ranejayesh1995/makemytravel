package com.example.makemytravel;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cabs {
    @GetMapping("/cabs")
    public String getData() {return  "Please book your cabs from mmt kindly book ticket for New Delhi to anywhere at 20% discount" ; }
}