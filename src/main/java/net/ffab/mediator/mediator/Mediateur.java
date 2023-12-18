package net.ffab.mediator.mediator;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediateur {
    protected Map<String,Collegue> collegues=new HashMap<>();

    public void addCollegue(String ref, Collegue collegue){
        collegues.put(ref,collegue);
    }

    public abstract void transmettreMessage(Message message);

}
