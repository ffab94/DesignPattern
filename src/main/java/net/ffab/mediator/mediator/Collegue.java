package net.ffab.mediator.mediator;

public abstract class Collegue {
    protected Mediateur mediateur;
    protected String nom;

    public Collegue(String nom) {
        this.nom = nom;
    }

    public Collegue(String nom, Mediateur mediateur) {
        this.mediateur = mediateur;
        this.nom=nom;
        mediateur.addCollegue(nom,this);
    }

    public Collegue() {
    }

    public abstract void envoyer(Message message);
    public abstract void recevoir(Message message);

    public Mediateur getMediateur() {
        return mediateur;
    }

    public void setMediateur(Mediateur mediateur) {
        this.mediateur = mediateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
