package net.ffab.strategy;

import net.ffab.strategy.composant.Context;
import net.ffab.strategy.composant.IStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws Exception{
        Context context=new Context();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Quelle strategy ?");
            String strategyClassName="net.ffab.strategy.StrategyImpl_" + scanner.nextLine();
            IStrategy strategy=(IStrategy) Class.forName(strategyClassName).getConstructor().newInstance();
            context.setStrategy(strategy);
            context.effectuerOperation();
        }

    }
}