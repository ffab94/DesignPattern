package net.ffab.adapter;

import net.ffab.adapter.computer.Ecran;
import net.ffab.adapter.computer.TV;
import net.ffab.adapter.computer.UniteCentrale;
import net.ffab.adapter.computer.VideoProjecteur;
import net.ffab.adapter.computer.adapter.HdmiVgaAdapter;
import net.ffab.adapter.computer.adapter.HdmiVgaAdapterH;

public class Main {
    public static void main(String[] args)  throws Exception{
        UniteCentrale uniteCentrale=new UniteCentrale();

        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Bonjour");

        uniteCentrale.setVga(new VideoProjecteur());
        uniteCentrale.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter=new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentrale.setVga(hdmiVgaAdapter);
        uniteCentrale.print("Bonsoir");

        HdmiVgaAdapterH hdmiVgaAdapterH=new HdmiVgaAdapterH();
        uniteCentrale.setVga(hdmiVgaAdapterH);
        uniteCentrale.print("Bonsoir");

    }
}