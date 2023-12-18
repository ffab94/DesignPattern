package net.ffab.abstractfactory;

import net.ffab.abstractfactory.plugin.AbstractFactory;
import net.ffab.abstractfactory.plugin.AbstractPlugin;
import net.ffab.abstractfactory.plugin.FactoryImplA;
import net.ffab.abstractfactory.plugin.FactoryImplB;
import net.ffab.adapter.computer.Ecran;
import net.ffab.adapter.computer.TV;
import net.ffab.adapter.computer.UniteCentrale;
import net.ffab.adapter.computer.VideoProjecteur;
import net.ffab.adapter.computer.adapter.HdmiVgaAdapter;
import net.ffab.adapter.computer.adapter.HdmiVgaAdapterH;

public class Main {
    public static void main(String[] args)  throws Exception{
        // Instanciation statique
        AbstractFactory factory=new FactoryImplB();
        AbstractPlugin plugin=factory.getInstance();
        plugin.traitement();

        // Instanciation dynamique
        AbstractFactory factory1=(AbstractFactory)
                Class.forName("net.ffab.abstractfactory.plugin.FactoryImplA").newInstance();
        AbstractPlugin plugin1=factory1.getInstance();
        plugin1.traitement();
    }
};
