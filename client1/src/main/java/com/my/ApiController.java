package com.my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private ServiceApi serviceApi;

    @RequestMapping("/api/{id}")
    public String api(@PathVariable String id) {
        return serviceApi.api(id);
    }
}
