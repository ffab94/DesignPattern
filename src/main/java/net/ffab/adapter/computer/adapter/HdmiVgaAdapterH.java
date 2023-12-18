package net.ffab.adapter.computer.adapter;

import net.ffab.adapter.computer.Hdmi;
import net.ffab.adapter.computer.TV;
import net.ffab.adapter.computer.Vga;

public class HdmiVgaAdapterH extends TV implements Vga {
    @Override
    public void print(String str) {
        System.out.println(".......... Adapter H .......................");
        byte[] data=str.getBytes();
        super.view(data);
        System.out.println(".......... Adapter H .......................");
    }
}
