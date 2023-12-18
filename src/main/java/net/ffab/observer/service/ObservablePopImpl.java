package net.ffab.observer.service;

import java.util.ArrayList;
import java.util.List;

public class ObservablePopImpl implements ObservablePop {
    private int state = 0;
    private List<ObserverPop> observers=new ArrayList<>();
    @Override
    public void subscribe(ObserverPop observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(ObserverPop observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverPop o:observers) {
            o.update(this);
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}
