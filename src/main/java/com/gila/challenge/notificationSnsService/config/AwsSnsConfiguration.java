package com.gila.challenge.notificationSnsService.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsSnsConfiguration {
  @Value ("${aws.access.key.id}")
  private String accessKey;
  @Value ("${aws.secret.access.key}")
  private String secretKey;

  @Bean
  public AWSCredentials awsCredentials() {

    return new BasicAWSCredentials(accessKey, secretKey);
  }

  @Bean
  public AmazonSNS amazonSNS() {

    return AmazonSNSClientBuilder.standard()
            .withCredentials(new AWSStaticCredentialsProvider(awsCredentials()))
            .withRegion(Regions.US_EAST_1)
            .build();
  }
}
