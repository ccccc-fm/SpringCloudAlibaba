package com.cccc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import java.util.UUID;

@EnableBinding(Source.class)
@Slf4j
public class SendMessageService {

    @Qualifier("output")
    @Autowired
    private MessageChannel channel;

    public String send() {
        String msg = UUID.randomUUID().toString();
        channel.send(MessageBuilder.withPayload(msg).build());
        log.info("消息生产者发送消息：" + msg);
        return msg;
    }
}
