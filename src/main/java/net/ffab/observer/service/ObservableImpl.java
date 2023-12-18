package net.ffab.observer.service;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int state = 0;
    private List<Observer> observers=new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers) {
            // o.update(state);
            o.update(state);
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
