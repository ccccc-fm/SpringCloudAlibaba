package com.cccc.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.cccc.apiService.ProviderService;
import com.cccc.common.CommonResult;
import com.cccc.sentinelFallback.SentinelFallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private ProviderService providerService;

    @GetMapping(value = "/consumer/getInfo")
    @SentinelResource(value = "info", blockHandlerClass = SentinelFallback.class, blockHandler = "streamLimit")
    public CommonResult getInfo() {
        CommonResult info = providerService.getInfo();
        return info;
    }
}
