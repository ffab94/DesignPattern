package net.ffab.factorymethod.factory;

public class Pizzeria {
    private  FabriquePizza fabrique;

    public Pizzeria(FabriquePizza fabrique) {
        this.fabrique = fabrique;
    }

    public Pizza commanderPizza(String type){
        Pizza p=fabrique.creerPizza(type);
        p.preparer();
        p.cuire();
        p.couper();
        p.emballer();
        return p;
    }
}
