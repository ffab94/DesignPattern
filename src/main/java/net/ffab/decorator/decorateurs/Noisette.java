package net.ffab.decorator.decorateurs;

import net.ffab.decorator.composant.Boisson;

public class Noisette extends Decorateur{
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " aux noisettes";
    }

    @Override
    public double cout() {
        return 0.8 + boisson.cout();
    }
}
