package net.ffab.mediator.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediateurImpl2 extends Mediateur{

    @Override
    public void transmettreMessage(Message message) {
        System.out.println("-----------------------------------");
        System.out.println("MediateurImpl2 ....................");
        System.out.println("Transmission du message :");
        System.out.println("de : "+message.getExpediteur());
        System.out.println("vers : "+message.getDestinataire());
        System.out.println("du contenu : "+message.getContenu());

        Collegue dest=collegues.get(message.getDestinataire());
        dest.recevoir(message);
    }
}
