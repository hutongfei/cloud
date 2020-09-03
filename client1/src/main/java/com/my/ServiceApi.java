package com.my;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("client-api")
public interface ServiceApi {

    @RequestMapping("/api/{id}")
    public String api(@PathVariable String id);
}
