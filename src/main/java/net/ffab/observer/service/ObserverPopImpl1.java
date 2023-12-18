package net.ffab.observer.service;

public class ObserverPopImpl1 implements ObserverPop {
    @Override
    public void update(ObservablePop observable) {
        if(observable instanceof ObservablePopImpl){
            int state = ((ObservablePopImpl) observable).getState();
            System.out.println("**************OBS1********************");
            System.out.println("State Value  -> " + state);
            System.out.println("*************************************");
        }


    }
}
