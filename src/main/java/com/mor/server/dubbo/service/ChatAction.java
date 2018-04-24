package com.mor.server.dubbo.service;  
  
import java.util.Date;  
  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class ChatAction {  
      
    public void SayHello(){   
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application.xml" });  
    context.start();  
    DemoServer demoServer = (DemoServer) context.getBean("demoService");  
    System.out.println("client:"+demoServer.sayHello("zx"+"1:"+new Date())+"3:"+new Date());  
    }  
}  