package net.ffab.command.command;

public class CommandD implements Command{
    private RecepteurImpl2 recepteur;

    public CommandD(RecepteurImpl2 recepteur) {
        this.recepteur = recepteur;
    }

    @Override
    public void executer() {
        recepteur.action3();
    }
}
