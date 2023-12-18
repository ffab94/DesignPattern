package net.ffab.composite;

import net.ffab.composite.composant.Composante;
import net.ffab.composite.composant.File;
import net.ffab.composite.composant.Folder;

public class Main {
    public static void main(String[] args)  throws Exception{
        Folder root = new Folder("root");
        root.add(new File("java.txt"));
        root.add(new File("pom.xml"));
        Folder src = (Folder) root.add(new Folder("src"));
        src.add(new File("data.csv"));
        src.add(new File("config.txt"));

        Folder org = (Folder) src.add(new Folder("org"));
        org.add(new File("data.bin"));
        org.add(new File("config.txt"));

        src.remove(org);

        root.afficher();

    }
}