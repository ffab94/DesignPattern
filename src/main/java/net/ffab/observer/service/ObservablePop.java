package net.ffab.observer.service;

public interface ObservablePop {
    void subscribe(ObserverPop observer);
    void unsubscribe(ObserverPop observer);
    void notifyObservers();
}
