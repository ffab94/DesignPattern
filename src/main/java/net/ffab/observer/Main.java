package net.ffab.observer;

import net.ffab.decorator.composant.Boisson;
import net.ffab.decorator.composant.Espresso;
import net.ffab.decorator.decorateurs.Caramel;
import net.ffab.decorator.decorateurs.Chocolat;
import net.ffab.observer.service.*;

import javax.print.attribute.standard.JobSheets;

public class Main {
    public static void main(String[] args)  throws Exception{
        /*
        ObservableImpl observable=new ObservableImpl();
        observable.setState(90);
        observable.setState(60);
        ObserverImpl1 observer1 = new ObserverImpl1();
        observable.subscribe(observer1);
        observable.subscribe(new ObserverImpl2());
        observable.setState(70);
        observable.setState(50);
        observable.setState(60);
        observable.unsubscribe(observer1);
        System.out.println("#####################################");
        observable.setState(44);
        observable.setState(34);

       observable.subscribe(new Observer() {
            @Override
            public void update(int state) {
                System.out.println("=============================");
                System.out.println("Prevision => " + Math.cos(state*2.66)*Math.log(state*state));
                System.out.println("=============================");
            }
        });
        observable.subscribe(state -> {
            System.out.println("=============================");
            System.out.println("Prevision => " + Math.cos(state*2.66)*Math.log(state*state));
            System.out.println("=============================");
        });
        observable.setState(65);
        observable.setState(44);
        */

        ObservablePopImpl observable=new ObservablePopImpl();
        observable.setState(90);
        observable.setState(60);
        ObserverPop observer1 = new ObserverPopImpl1();
        observable.subscribe(observer1);
        observable.subscribe(new ObserverPopImpl2());
        observable.setState(70);
        observable.setState(50);
        observable.setState(60);
        observable.unsubscribe(observer1);
        System.out.println("#####################################");
        observable.setState(44);
        observable.setState(34);

        observable.subscribe(new ObserverPop() {
            @Override
            public void update(ObservablePop observable) {
                if (observable instanceof ObservablePopImpl) {
                    int state = ((ObservablePopImpl) observable).getState();
                    System.out.println("=============================");
                    System.out.println("Prevision => " + Math.cos(state * 2.66) * Math.log(state * state));
                    System.out.println("=============================");
                }
            }
        });

        observable.subscribe(o -> {
            if(o instanceof ObservablePopImpl) {
                int state = ((ObservablePopImpl) o).getState();
                System.out.println("=============================");
                System.out.println("Prevision => " + Math.cos(state * 2.66) * Math.log(state * state));
                System.out.println("=============================");
            }
        });

        observable.setState(65);
        observable.setState(44);
    }
}