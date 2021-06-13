package com.ppt.chatapp.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "user")
public class Users {
   private String name;
   private String email;
   private String mobile;
   private String password;
}
