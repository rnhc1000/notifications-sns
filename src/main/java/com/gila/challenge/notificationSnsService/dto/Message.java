package com.gila.challenge.notificationSnsService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message{
  private String message;
  private String name;
  private String phone;
  private String email;

  @Override
  public String toString() {
    return "Message{" +
            "message='" + message + '\'' +
            ", name='" + name + '\'' +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            ", createdAt=" + createdAt +
            ", messageId='" + messageId + '\'' +
            '}';
  }

  private Instant createdAt;
  private String messageId;
}

