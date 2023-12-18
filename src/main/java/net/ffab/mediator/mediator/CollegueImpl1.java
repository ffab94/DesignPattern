package net.ffab.mediator.mediator;

public class CollegueImpl1 extends Collegue{
    public CollegueImpl1(String nom) {
        super(nom);
    }

    public CollegueImpl1(String nom, Mediateur mediateur) {
        super(nom, mediateur);
    }

    public CollegueImpl1() {
    }

    @Override
    public void envoyer(Message message) {
        System.out.println("CollegueImpl1 Nom=" +nom + " .................................");
        System.out.println("Envoi du messager vers "+message.getDestinataire());
        message.setExpediteur(nom);
        mediateur.transmettreMessage(message);
    }

    @Override
    public void recevoir(Message message) {
        System.out.println("CollegueImpl1 Nom=" +nom + " .................................");
        System.out.println("Réception du messager depuis "+message.getExpediteur());
        System.out.println("Contenu: "+ message.getContenu());



    }
}
