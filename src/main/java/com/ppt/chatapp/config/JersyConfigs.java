package com.ppt.chatapp.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.ppt.chatapp.endpoint.UserEndPoint;
import com.ppt.chatapp.web.CorsFilter;

@Configuration
public class JersyConfigs extends ResourceConfig {
  
	public JersyConfigs() {
		register(UserEndPoint.class);
		register(CorsFilter.class);
	}
}
