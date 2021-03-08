package com.cccc.apiService.fallbackImpl;

import com.cccc.apiService.ProviderService;
import com.cccc.common.CommonResult;
import org.springframework.stereotype.Component;

@Component
public class ProviderServiceImpl implements ProviderService {

    @Override
    public CommonResult getInfo() {
        return CommonResult.success("服务器异常，请您稍后再试！");
    }
}
