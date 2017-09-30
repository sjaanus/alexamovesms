package com.hackathon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Jaanus on 30.09.2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Body {
	private Message message;
	private String test;

	public Body() {
	}

	public Body(String json) {
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}


}
