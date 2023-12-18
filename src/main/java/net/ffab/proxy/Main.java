package net.ffab.proxy;

import net.ffab.proxy.proxy.*;
import net.ffab.proxy.service.Context;
import net.ffab.proxy.service.ServiceImpl;

public class Main {
    public static void main(String[] args)  throws Exception{
        SecurityContext.authenticate("user1","1234","admin");
        //SecurityContext.authenticate("user2","1234","user");
        Context context = new Context();
        // context.setService(new Proxy());
        // context.setService(new SecurityProxy());
        // context.setService(new CacheProxy());

        context.setService(new SecurityProxy(new CacheProxy(new LoggingProxy(new ServiceImpl()))));
        context.compute(1);


    }
}