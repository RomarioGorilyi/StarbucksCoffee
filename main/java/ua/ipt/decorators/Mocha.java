package main.java.ua.ipt.decorators;

import main.java.ua.ipt.component.Beverage;

/**
 * Created by Roman Horilyi on 04.09.2016.
 */
public class Mocha extends CondimentDecorator {
     private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case "small":   return .15 + beverage.cost();
            case "medium":  return .20 + beverage.cost();
            case "large":   return .25 + beverage.cost();
            default:        return .20 + beverage.cost();
        }
    }
}
