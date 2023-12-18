package net.ffab.proxy.proxy;

import net.ffab.proxy.Main;
import net.ffab.proxy.service.IService;
import net.ffab.proxy.service.ServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements IService {
    private Map<Integer,Double> cache=new HashMap<>();
    private IService service;
    public CacheProxy(IService service) {
        this.service = service;
    }
    @Override
    public double compute(int parameter) {
        Double cacheValue=cache.get(parameter);
        if(cacheValue !=  null) {

            return cacheValue;
        }
        double res = service.compute(parameter);
        cache.put(parameter,res);
        System.out.println("Cache: Ajout de <" + parameter + "," + res +">");
        return res;
    }
}
