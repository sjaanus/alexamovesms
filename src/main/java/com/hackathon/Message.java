package com.hackathon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Jaanus on 30.09.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Message {
	private String content;

}
