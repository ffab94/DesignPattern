package net.ffab.State.state;

public interface Avion {
    void sortirDuGarage(); // Opération de transition d'état.
    void entrerAuGarage(); // Opération de transition d'état.
    void decoller(); // Opération de transition d'état.
    void atterrir(); // Opération de transition d'état.
    void doActivity(); // Activité
}
