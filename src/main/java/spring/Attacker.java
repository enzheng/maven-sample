package spring;

import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

public class Attacker {
    public static void main(String[] args) {
        HttpInvokerProxyFactoryBean factory = new HttpInvokerProxyFactoryBean();
//        factory.setServiceUrl("http://vulnerable.com/service");
//        factory.setServiceInterface(MyService.class);
        MyService service = (MyService) factory.getObject();
        //Exploit exploit = new Exploit();
        service.getMessage();
    }
}