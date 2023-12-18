package net.ffab.factorymethod.factory;

public class FabriqueCasa implements FabriquePizza{
    @Override
    public Pizza creerPizza(String type) {
        Pizza p=null;
        if  (type.equals("fromage"))
            p=new PizzaFromage();
        else if  (type.equals("fruits de mer"))
            p=new PizzaFruitsDeMer();
        return p;
    }
}
