package org.jboss.tools.examples.ejb;

import javax.ejb.Stateless;

@Stateless
public class HelloService {
    public String sayHello(){
        return "Hello from control: " + System.currentTimeMillis();
    }
}
