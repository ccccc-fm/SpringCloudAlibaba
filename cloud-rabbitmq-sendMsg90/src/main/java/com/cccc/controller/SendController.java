package com.cccc.controller;

import com.cccc.service.SendMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class SendController {

    @Resource
    SendMessageService sendMessageService;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        String result = sendMessageService.send();
        return result;
    }
}
