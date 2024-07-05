package com.gila.challenge.notificationSnsService.consumer;

import com.gila.challenge.notificationSnsService.dto.MessageEvent;
import com.gila.challenge.notificationSnsService.service.MessageSnsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSnsConsumer {


  private final static Logger LOGGER = LoggerFactory.getLogger(MessageSnsConsumer.class);

  @Autowired
  private MessageSnsService messageSnsService;

  @RabbitListener (queues="${rabbitmq.queue.sns.name}")
  public void consume(MessageEvent event) {

    LOGGER.info("and forwarded to AWS SNS");
    messageSnsService.notify("5599992205555","Message sent...", "Ricardo Ferreira");
  }
}
