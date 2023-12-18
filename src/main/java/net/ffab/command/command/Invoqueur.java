package net.ffab.command.command;

import java.util.HashMap;
import java.util.Map;

public class Invoqueur {
    private Map<String,Command> commands=new HashMap<>();

    public void addNewCommand(String ref, Command command){
        commands.put(ref,command);
    }

    public void invoquer(String ref){
        Command command=commands.get(ref);
        if(command != null)
            command.executer();

    }

}
