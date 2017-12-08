package app;

import dao.Service;

public class Application 
{
Service service;

public void print()
{
	System.out.println(service.myString());
	}

public Service getService() {
	return service;
}

public void setService(Service service) {
	this.service = service;
}

}
