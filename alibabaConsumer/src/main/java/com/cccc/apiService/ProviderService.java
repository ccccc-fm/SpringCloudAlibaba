package com.cccc.apiService;

import com.cccc.apiService.fallbackImpl.ProviderServiceImpl;
import com.cccc.common.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "alibaba-provider", fallback = ProviderServiceImpl.class)
public interface ProviderService {

    @GetMapping(value = "/getInfo")
    public CommonResult getInfo();
}
