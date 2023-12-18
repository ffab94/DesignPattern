package net.ffab.adapter;

import net.ffab.adapter.computer.Ecran;
import net.ffab.adapter.computer.TV;
import net.ffab.adapter.computer.UniteCentrale;
import net.ffab.adapter.computer.VideoProjecteur;
import net.ffab.adapter.computer.adapter.HdmiVgaAdapter;
import net.ffab.adapter.computer.adapter.HdmiVgaAdapterH;
import net.ffab.builder_singleton.model.AccountStatus;
import net.ffab.builder_singleton.model.BankAccount;
import net.ffab.builder_singleton.repository.AccountRepositoryImpl;
import net.ffab.builder_singleton.util.JsonSerializer;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.List;

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