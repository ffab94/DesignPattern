package net.ffab.command;

import net.ffab.State.state.Avion;
import net.ffab.State.state.AvionImpl;
import net.ffab.command.command.*;

public class Main {
    public static void main(String[] args)  throws Exception{
        RecepteurImpl1 rec1=new RecepteurImpl1();
        RecepteurImpl2 rec2=new RecepteurImpl2();

        Command cmd1=new CommandA(rec1);
        Command cmd2=new CommandB(rec1);
        Command cmd3=new CommandC(rec2);
        Command cmd4=new CommandD(rec2);

        Invoqueur telecommand=new Invoqueur();
        telecommand.addNewCommand("A",cmd1);
        telecommand.addNewCommand("B",cmd2);
        telecommand.addNewCommand("C",cmd3);
        telecommand.addNewCommand("D",cmd4);

        telecommand.invoquer("A");
        telecommand.invoquer("D");
    }
}