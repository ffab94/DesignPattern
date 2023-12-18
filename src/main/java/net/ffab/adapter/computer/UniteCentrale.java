package net.ffab.adapter.computer;

import javax.naming.SizeLimitExceededException;

public class UniteCentrale {
    private Vga vga;

    public void print(String str) throws InterruptedException {
        System.out.println("=================================");
        vga.print(str);
        Thread.sleep(1000);
        System.out.println("=================================");
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }
}
