package net.ffab.proxy.proxy;

import net.ffab.proxy.service.IService;
import net.ffab.proxy.service.ServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class LoggingProxy implements IService {
    private IService service;
    public LoggingProxy(IService service) {
        this.service = service;
    }
    @Override
    public double compute(int parameter) {
        long t1=System.currentTimeMillis();
        double res = service.compute(parameter);
        long t2=System.currentTimeMillis();
        System.out.println("Duration => " + (t2-t1));
        return res;
    }
}
