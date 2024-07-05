package com.gila.challenge.notificationSnsService.service;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.PublishRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageSnsService {
  @Autowired
  private AmazonSNS amazonSNS;

  public void notify(String phone, String message, String name) {

    PublishRequest publishRequest = new PublishRequest()
            .withMessage(message)
            .withPhoneNumber(phone)
            .withSubject(name);

    amazonSNS.publish(publishRequest);
  }

}
