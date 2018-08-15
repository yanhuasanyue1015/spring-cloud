package com.example.servicefeign.service;

import com.example.servicefeign.service.errorimpl.HiServiceErrorImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "test",url = "http://localhost:8762",fallback = HiServiceErrorImpl.class)
public interface HiService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hi(@RequestParam("name") String name);
}
