package net.ffab.State;

import net.ffab.State.state.Avion;
import net.ffab.State.state.AvionImpl;
import net.ffab.TemplateMethod.Template.Template;
import net.ffab.TemplateMethod.Template.TemplateImpl1;
import net.ffab.TemplateMethod.Template.TemplateImpl2;

public class Main {
    public static void main(String[] args)  throws Exception{
        Avion avion=new AvionImpl();
        avion.doActivity();
        System.out.println("---------------------------------");
        avion.sortirDuGarage();
        System.out.println("---------------------------------");
        avion.doActivity();
        System.out.println("---------------------------------");
        avion.entrerAuGarage();
        avion.doActivity();
        System.out.println("---------------------------------");
        avion.entrerAuGarage();

    }
}