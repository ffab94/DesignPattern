package net.ffab.decorator.decorateurs;

import net.ffab.decorator.composant.Boisson;

public abstract class Decorateur extends Boisson{
    protected Boisson boisson;

    public Decorateur(Boisson boisson) {
        this.boisson = boisson;
    }
}
