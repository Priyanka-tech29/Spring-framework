package com.in29minutes.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//currency-service.url
//currency-service.username
//currency-service.key
//we want string to manage it that's why we are using @component
//now you can configure these properties in application.properties file

@ConfigurationProperties(prefix="currency-service")
@Component
public class CurrencyServiceConfiguration {
	
	private String url;
	private String username;
	private String key;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
