package com.cn.factservice.client;

import com.cn.factservice.model.FactList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "fact-client", url = "${fact.url}")
public interface FactClient {
    @GetMapping
    FactList getFacts();
}
