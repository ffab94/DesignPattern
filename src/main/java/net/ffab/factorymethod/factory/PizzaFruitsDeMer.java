package net.ffab.factorymethod.factory;

public class PizzaFruitsDeMer extends Pizza{
    public PizzaFruitsDeMer() {
        description="Pizza au fruits de mer";
    }

    @Override
    public void cuire() {
        System.out.println("Cuire en six minutes");
    }

    @Override
    public void emballer() {
        System.out.println("Emballage simple");
    }

    @Override
    public void preparer() {
        System.out.println("Preparation en sept minutes");
    }

    @Override
    public void couper() {
        System.out.println("Découpe en six morceaux");
    }
}
