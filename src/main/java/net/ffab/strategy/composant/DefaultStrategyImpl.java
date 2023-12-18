package net.ffab.strategy.composant;

import net.ffab.strategy.composant.IStrategy;

public class DefaultStrategyImpl implements IStrategy {

    @Override
    public void operationStrategy() {

        System.out.println("!!!!!!!!!!! Default Strategy !!!!!!!!!!!!!!!!");
    }
}
