package com.cccc.sentinelFallback;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cccc.common.CommonResult;
import org.springframework.stereotype.Component;

@Component
public class SentinelFallback {

    public static CommonResult streamLimit(BlockException blockHandler) {
        return CommonResult.success("当前访问人数较多，请稍后再试！");
    }
}
