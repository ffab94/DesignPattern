package net.ffab.strategy.composant;

public class Context {
    private IStrategy strategy = new DefaultStrategyImpl();

    public void effectuerOperation(){
        System.out.println("**********************");
        strategy.operationStrategy();
        System.out.println("----------------------");
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
