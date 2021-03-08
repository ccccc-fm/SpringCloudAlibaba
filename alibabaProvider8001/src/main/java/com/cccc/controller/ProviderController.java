package com.cccc.controller;

import com.cccc.common.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/getInfo")
    public CommonResult getInfo() {
        int i = 1 / 0;
        return CommonResult.success("服务提供者：" + serverPort);
    }
}
