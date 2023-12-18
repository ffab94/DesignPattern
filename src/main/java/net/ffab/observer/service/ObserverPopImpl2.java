package net.ffab.observer.service;

import java.util.ArrayList;
import java.util.List;

public class ObserverPopImpl2 implements ObserverPop {
    List<Integer> history=new ArrayList<>();
    @Override
    public void update(ObservablePop observablePop) {
        if(observablePop instanceof ObservableImpl) {
            int state = ((ObservableImpl) observablePop).getState();
            System.out.println("**************OBS2********************");

            history.add(state);
            double sum = 0;
            for (Integer h : history) {
                sum += h;
            }
            System.out.println("Stage AVG -> " + sum / history.size());
            System.out.println("*************************************");
        }
    }
}
