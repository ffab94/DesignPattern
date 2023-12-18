package net.ffab.State.state;

public class AvionImpl implements Avion {
    private State state;

    public AvionImpl(){
        state=new EtatEnPiste();
    }
    @Override
    public void sortirDuGarage() {
        state.executerSortirDuGarage();
    }

    @Override
    public void entrerAuGarage() {
        state.executerEntrerAuGarage();
    }

    @Override
    public void decoller() {
        state.executerDecoller();
    }

    @Override
    public void atterrir() {
        state.executerAtterrir();
    }

    @Override
    public void doActivity() {
        state.executerDoActivity();
    }

    abstract class State{
        abstract void executerSortirDuGarage(); // Opération de transition d'état.
        abstract void executerEntrerAuGarage(); // Opération de transition d'état.
        abstract void executerDecoller(); // Opération de transition d'état.
        abstract void executerAtterrir(); // Opération de transition d'état.
        abstract void executerDoActivity(); // Activité
    }

    class EtatEnPiste extends State{

        @Override
        void executerSortirDuGarage() {
            System.out.println("Impossible de sortir du garage. Je suis en l'état en piste.");
        }

        @Override
        void executerEntrerAuGarage() {
            System.out.println("Transition d'état : En piste => Au garage");
            state=new EtatAuGarage();
        }

        @Override
        void executerDecoller() {
            System.out.println("Transition d'état : En piste => En l'air");
            state=new EtatEnLair();
        }

        @Override
        void executerAtterrir() {
            System.out.println("Impossible d'atterrir. Je suis en l'état en piste.");
        }

        @Override
        void executerDoActivity() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Activité de l'état en piste ......" + i);
            }
        }
    }

    class EtatAuGarage extends State{

        @Override
        void executerSortirDuGarage() {
            System.out.println("Transition d'état : Au garage => En piste");
            state=new EtatEnPiste();
        }

        @Override
        void executerEntrerAuGarage() {
            System.out.println("Impossible d'entrer au garage. Je suis déjà dans le garage.");
        }

        @Override
        void executerDecoller() {
            System.out.println("Impossible de décoller. Je suis dans le garage.");
        }

        @Override
        void executerAtterrir() {
            System.out.println("Impossible d'atterrir. Je suis dans le garage.");
        }

        @Override
        void executerDoActivity() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Activité de l'état au garage ....." + i);
            }
        }
    }

    class EtatEnLair extends State{

        @Override
        void executerSortirDuGarage() {
            System.out.println("Impossible de sortir du garage. Je suis en l'air.");
        }

        @Override
        void executerEntrerAuGarage() {
            System.out.println("Impossible d'entrer au garage. Je suis en l'air.");
        }

        @Override
        void executerDecoller() {
            System.out.println("Impossible de decoller. Je suis en l'air.");
        }

        @Override
        void executerAtterrir() {
            System.out.println("Transition d'état : En l'air => En piste");
            state=new EtatEnPiste();
        }

        @Override
        void executerDoActivity() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Activité de l'état en l'air ....." + i);
            }
        }
    }
}
