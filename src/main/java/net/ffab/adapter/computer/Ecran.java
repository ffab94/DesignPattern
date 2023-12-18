package net.ffab.adapter.computer;

public class Ecran implements Vga{
    @Override
    public void print(String str) {
        System.out.println("************ Ecran ****************");
        System.out.println(str);
        System.out.println("************ Ecran ****************");
    }
}
