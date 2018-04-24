package com.mor.client.dubbo.main;  
import com.mor.server.dubbo.service.ChatAction;  
  
/** 
 * 客户端的执行入口 
 * @author zx 
 * @date 2015年8月17日 下午3:18:00 
 */  
public class Main {  
  
    public static void main(String[] args) throws InterruptedException {  
        int i=0;  
        while(i++<100){  
            ChatAction act = new ChatAction();  
            act.SayHello();  
            Thread.sleep(3000);  
        }  
    }  
  
}