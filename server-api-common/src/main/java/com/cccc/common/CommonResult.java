package com.cccc.common;


import lombok.Data;

@Data
public class CommonResult {

    private int code;
    private String message;
    private Object data;


    public static CommonResult success(String data) {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(200);
        commonResult.setData(data);
        return commonResult;
    }

    public static CommonResult success(Object data) {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(200);
        commonResult.setData(data);
        return commonResult;
    }

    public static CommonResult success() {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(200);
        return commonResult;
    }


    public static CommonResult success(String message, Object data) {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(200);
        commonResult.setMessage(message);
        commonResult.setData(data);
        return commonResult;
    }

    public static CommonResult fail(int code, String message, Object data) {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(code);
        commonResult.setMessage(message);
        commonResult.setData(data);
        return commonResult;
    }

    public static CommonResult fail(int code, String message) {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(code);
        commonResult.setMessage(message);
        return commonResult;
    }


}
