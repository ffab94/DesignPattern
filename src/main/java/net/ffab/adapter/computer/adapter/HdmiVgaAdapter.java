package net.ffab.adapter.computer.adapter;

import net.ffab.adapter.computer.Hdmi;
import net.ffab.adapter.computer.TV;
import net.ffab.adapter.computer.Vga;

public class HdmiVgaAdapter implements Vga {
    private Hdmi hdmi;
    @Override
    public void print(String str) {
        System.out.println(".......... Adapter .......................");
        byte[] data=str.getBytes();
        hdmi.view(data);
        System.out.println(".......... Adapter .......................");
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
