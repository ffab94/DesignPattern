package net.ffab.mediator.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediateurImpl1 extends Mediateur{
    private List<Message> conversations=new ArrayList<>();
    @Override
    public void transmettreMessage(Message message) {
        System.out.println("-----------------------------------");
        System.out.println("MediateurImpl1 ....................");
        System.out.println("Transmission du message :");
        System.out.println("de : "+message.getExpediteur());
        System.out.println("vers : "+message.getDestinataire());
        System.out.println("du contenu : "+message.getContenu());

        Collegue dest=collegues.get(message.getDestinataire());
        dest.recevoir(message);
        conversations.add(message);
    }
    
    public void analyserConversation(){
        for (Message m:conversations) {
            System.out.println(m.toString());
        }
    }
}
