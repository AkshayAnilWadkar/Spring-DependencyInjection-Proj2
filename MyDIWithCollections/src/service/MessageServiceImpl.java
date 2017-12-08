package service;

import java.util.Collection;

public class MessageServiceImpl implements MessageService{

	Collection<String> listOfMessages;
	
	
	public MessageServiceImpl(Collection<String> listOfMessages) {
		// TODO Auto-generated constructor stub
	
	super();

	this.listOfMessages=listOfMessages;
	}
	
	@Override
	public String getMessgae() {
		// TODO Auto-generated method stub
		return "HelloWorld";
	}

	@Override
	public Collection<String> getAllMessages() {
		// TODO Auto-generated method stub
		return listOfMessages;
	}

}
