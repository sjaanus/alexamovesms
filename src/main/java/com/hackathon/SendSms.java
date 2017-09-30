package com.hackathon;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jaanus on 30.09.2017.
 */
public class SendSms implements RequestHandler<Request, String> {
	private final static String ACCESS_KEY = "ACCESS_KEY";
	private final static String SECRET_KEY = "SECRET_KEY";
	private final static String PHONE = "PHONE";

	public String handleRequest(Request request, Context context) {
		System.out.println(request.getMessage());
		System.out.println(request.getMessage().getContent());
		AmazonSNSClient snsClient = new AmazonSNSClient(new BasicAWSCredentials(System.getenv(ACCESS_KEY),
				System.getenv(SECRET_KEY)));
		String message = "My SMS message";
		String phoneNumber = System.getenv(PHONE);
		Map<String, MessageAttributeValue> smsAttributes =
				new HashMap<String, MessageAttributeValue>();

		sendSMSMessage(snsClient, request.getMessage().getContent(), phoneNumber, smsAttributes);
		return "hello world";
	}

	public String smsHandler(Request input, Context context) {


		return "hello world";
	}

	public void sendSMSMessage(AmazonSNSClient snsClient, String message,
									  String phoneNumber, Map<String, MessageAttributeValue> smsAttributes) {
		PublishResult result = snsClient.publish(new PublishRequest()
				.withMessage(message)
				.withPhoneNumber(phoneNumber)
				.withMessageAttributes(smsAttributes));
		System.out.println(result); // Prints the message ID.
	}


}
