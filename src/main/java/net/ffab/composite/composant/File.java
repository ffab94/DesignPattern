package net.ffab.composite.composant;

public class File extends Composante{
    public File(String name) {
        super(name);
    }

    @Override
    public void afficher() {

        System.out.println(getTab() + "- File -> " + name);
    }
}
