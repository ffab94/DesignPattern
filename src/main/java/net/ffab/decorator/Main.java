package net.ffab.decorator;

import net.ffab.decorator.composant.Boisson;
import net.ffab.decorator.composant.Espresso;
import net.ffab.decorator.decorateurs.Caramel;
import net.ffab.decorator.decorateurs.Chocolat;

public class Main {
    public static void main(String[] args)  throws Exception{
        Boisson boisson;
        boisson = new Espresso();
        System.out.println("Description: " + boisson.getDescription());
        System.out.println("Côut: " + boisson.cout());
        System.out.println("-------------------------------------------");
        boisson = new Chocolat(boisson);
        System.out.println("Description: " + boisson.getDescription());
        System.out.println("Côut: " + boisson.cout());
        System.out.println("-------------------------------------------");
        boisson = new Caramel(boisson);
        System.out.println("Description: " + boisson.getDescription());
        System.out.println("Côut: " + boisson.cout());
        System.out.println("-------------------------------------------");
    }
}