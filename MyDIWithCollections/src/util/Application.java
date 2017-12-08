package util;

import java.util.Collection;

import service.MessageService;

public class Application
{
MessageService service;

public MessageService getService() {
	return service;
}

public void setService(MessageService service) {
	this.service = service;
}


public void printAllMessages()
{
Collection<String> listOfMessages=service.getAllMessages();

for(String message:listOfMessages)
	System.out.println(message);
}

}
