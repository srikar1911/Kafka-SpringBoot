package com.nt.consumer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component("msgStore")
public class MessageStore {
	
	private List<String> messages =new ArrayList<>();
	
	
	public void addMessage(String message) {
		messages.add(message);
	}
	
	public List<String>showAllMessages(){
		return messages;
	}



}

