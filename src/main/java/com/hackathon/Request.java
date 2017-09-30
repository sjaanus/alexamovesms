package com.hackathon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Jaanus on 30.09.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Request {
	private Body body;

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Request() {

	}
}
