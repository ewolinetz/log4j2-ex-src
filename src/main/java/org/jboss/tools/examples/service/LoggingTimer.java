package org.jboss.tools.examples.service;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;

import org.jboss.tools.examples.ejb.HelloService;

@Singleton
public class LoggingTimer {

	@EJB
    HelloService helloService;

    @Schedule(second="*/1", minute="*",hour="*", persistent=false)
    public void doWork(){

    	System.out.println("timer: " + helloService.sayHello());
    }
}
