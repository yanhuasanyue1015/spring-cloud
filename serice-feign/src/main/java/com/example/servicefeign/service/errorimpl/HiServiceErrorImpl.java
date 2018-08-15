package com.example.servicefeign.service.errorimpl;

import com.example.servicefeign.service.HiService;
import org.springframework.stereotype.Component;

@Component
public class HiServiceErrorImpl implements HiService {
    @Override
    public String hi(String name) {
          return "sorry "+name+" ,服务调用失败";
    }
}
