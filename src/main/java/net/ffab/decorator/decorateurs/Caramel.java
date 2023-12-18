package net.ffab.decorator.decorateurs;

import net.ffab.decorator.composant.Boisson;

public class Caramel extends Decorateur{
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au caramel";
    }

    @Override
    public double cout() {
        return 0.8 + boisson.cout();
    }
}
