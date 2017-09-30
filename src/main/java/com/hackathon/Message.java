package com.hackathon;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Jaanus on 30.09.2017.
 */
@Getter
@Setter
public class Message {
	@JsonProperty("content")
	private String content;
}
