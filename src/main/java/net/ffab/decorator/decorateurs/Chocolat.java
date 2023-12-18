package net.ffab.decorator.decorateurs;

import net.ffab.decorator.composant.Boisson;

public class Chocolat extends Decorateur{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au chocolat";
    }

    @Override
    public double cout() {
        return 1.2 + boisson.cout();
    }
}
