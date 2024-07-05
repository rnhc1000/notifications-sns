## Take-home SNS Microservices Challenge
This is how we faced the challenge of creating a notification sns services.

## _Table of contents_
- [Take-home Microservices Challenge](#take-home-microservices-challenge)
- [_Table of contents_](#table-of-contents)
- [_Overview_](#overview)
- [_Screenshot_](#screenshot)
- [_Links_](#links)
- [_Built with_](#built-with)
- [_How I did it_](#how-i-did-it)
- [_Continued development_](#continued-development)
  - [_Useful resources_](#useful-resources)
- [_Author_](#author)
- [Acknowledgments](#acknowledgments)
## _Overview_

The design is structured as shown:
-  src|
    - main
    - java|
        - com/xxx/challenge/notificationSnsService|
            - config
            - dto
            - consumer
            - service
        - test
## _Screenshot_
[![](./notification.png)]()
## _Links_
- Live Site URL: [https://www.ferreiras.dev.br] 
## _Built with_

[![My Skills](https://skillicons.dev/icons?i=java,spring,rabbitmq,redhat,aws,idea,git,github)](https://skillicons.dev)




 ## _How I did it_
``` java
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


``` 

## _Continued development_
- maybe
### _Useful resources_
- [https://spring.io/projects/spring-cloud-aws]  eases the integration with hosted Amazon Web Service
- [http://aws.amazon.com/sns/]  Annotation-based mapping of [SNS] endpoints (HTTP)

## _Author_
- Website - [https://ferreiras.dev.br] 
## Acknowledgments
- 
