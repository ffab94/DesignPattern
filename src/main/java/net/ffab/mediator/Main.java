package net.ffab.mediator;

import net.ffab.State.state.Avion;
import net.ffab.State.state.AvionImpl;
import net.ffab.mediator.mediator.*;

public class Main {
    public static void main(String[] args)  throws Exception {
        MediateurImpl1 mediateur1 = new MediateurImpl1();
        Collegue c1 = new CollegueImpl1("A", mediateur1);
        Collegue c2 = new CollegueImpl1("B", mediateur1);
        Collegue c3 = new CollegueImpl1("C", mediateur1);

        c1.envoyer(new Message("xxxxxxxx", "B"));
        c1.envoyer(new Message("AAAAAAAA", "C"));
        c2.envoyer(new Message("BBBBBBBB", "A"));

        System.out.println("#####################################");
        System.out.println("           Analyse Conversations");
        mediateur1.analyserConversation();
    }
}