package net.ffab.factorymethod.factory;

public class PizzaParisienne extends Pizza{
    public PizzaParisienne() {
        description="Pizza parisienne";
    }

    @Override
    public void cuire() {
        System.out.println("Cuire en cinq minutes");
    }

    @Override
    public void emballer() {
        System.out.println("Emballage simple");
    }

    @Override
    public void preparer() {
        System.out.println("Preparation en quatre minutes");
    }

    @Override
    public void couper() {
        System.out.println("Découpe en quatre morceaux");
    }
}
