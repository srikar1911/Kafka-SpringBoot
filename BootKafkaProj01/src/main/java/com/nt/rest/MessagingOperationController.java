package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.consumer.MessageStore;
import com.nt.producer.MessageProducer;

@RestController
public class MessagingOperationController {

	@Autowired
	private MessageStore store;
	
	@Autowired
	private MessageProducer producer;
	
	@GetMapping("/send")
	public ResponseEntity<String>sendMessage(@RequestParam("message") String message){
		
		String result = producer.sendMessage(message);
		
		return new ResponseEntity<String>(result, HttpStatus.OK);
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<String>> showAllMessages(){
		List<String>list=store.showAllMessages();
				return new ResponseEntity<List<String>>(list,HttpStatus.OK);
	}







}
