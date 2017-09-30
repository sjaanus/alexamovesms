package com.hackathon;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import java.util.Map;

/**
 * Created by Jaanus on 30.09.2017.
 */
public class SendSms {
	public String smsHandler(Map<String,Object> input, Context context) {
		System.out.println("hello");
		return "hello world";
	}

}
