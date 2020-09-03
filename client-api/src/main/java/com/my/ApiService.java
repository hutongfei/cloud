package com.my;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiService {

    @RequestMapping("/api/{id}")
    public String api(@PathVariable String id) {
        System.out.println(this.getClass().getName() + " is running ");
        return id;
    }
}
