package com.cccc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;


@Component
@EnableBinding(Sink.class)
@Slf4j
public class ReceiverMessage {

    @StreamListener(Sink.INPUT)
    public void input(Message<String> msg) {
        log.info("接收消息：" + msg.getPayload());
        System.out.println(msg.getPayload());
    }
}
