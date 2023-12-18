package net.ffab.adapter.computer;

public class VideoProjecteur implements Vga{
    @Override
    public void print(String str) {
        System.out.println("################ Retro ######################");
        System.out.println(str);
        System.out.println("################ Retro ######################");
    }
}
