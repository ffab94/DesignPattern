package net.ffab.mediator.mediator;

public class CollegueImpl2 extends Collegue{
    public CollegueImpl2(String nom) {
        super(nom);
    }

    public CollegueImpl2(String nom, Mediateur mediateur) {
        super(nom, mediateur);
    }

    public CollegueImpl2() {
    }

    @Override
    public void envoyer(Message message) {
        System.out.println("CollegueImpl2 Nom=" +nom + " .................................");
        System.out.println("Envoi du messager vers "+message.getDestinataire());
        message.setExpediteur(nom);
        mediateur.transmettreMessage(message);
    }

    @Override
    public void recevoir(Message message) {
        System.out.println("CollegueImpl2 Nom=" +nom + " .................................");
        System.out.println("Réception du messager depuis "+message.getExpediteur());
        System.out.println("Contenu: "+ message.getContenu());

    }
}
