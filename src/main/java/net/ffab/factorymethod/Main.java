package net.ffab.factorymethod;

import net.ffab.adapter.computer.Ecran;
import net.ffab.adapter.computer.TV;
import net.ffab.adapter.computer.UniteCentrale;
import net.ffab.adapter.computer.VideoProjecteur;
import net.ffab.adapter.computer.adapter.HdmiVgaAdapter;
import net.ffab.adapter.computer.adapter.HdmiVgaAdapterH;
import net.ffab.factorymethod.factory.FabriqueCasa;
import net.ffab.factorymethod.factory.Pizza;
import net.ffab.factorymethod.factory.Pizzeria;

public class Main {
    public static void main(String[] args)  throws Exception{
        Pizzeria pizzeria=new Pizzeria(new FabriqueCasa());
        Pizza p1=pizzeria.commanderPizza("fromage");
        System.out.println(p1.getDescription());
    }
}