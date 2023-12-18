package net.ffab.proxy.proxy;

import net.ffab.proxy.service.IService;
import net.ffab.proxy.service.ServiceImpl;

public class Proxy implements IService {
    private IService service;
    public Proxy(IService service) {
        this.service = service;
    }
    @Override
    public double compute(int parameter) {
        System.out.println("--------------- Proxy before ------------------");
        double res = service.compute(parameter);
        System.out.println("--------------- Proxy after ------------------");
        return res;
    }
}
