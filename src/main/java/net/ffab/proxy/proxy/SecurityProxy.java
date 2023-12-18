package net.ffab.proxy.proxy;

import net.ffab.proxy.service.IService;
import net.ffab.proxy.service.ServiceImpl;

public class SecurityProxy implements IService {
    private IService service;
    public SecurityProxy(IService service) {
        this.service = service;
    }
    @Override
    public double compute(int parameter) {
        if (!SecurityContext.role.equals("admin"))
            throw new RuntimeException("Not authorized");
        double res = service.compute(parameter);
        return res;
    }
}
