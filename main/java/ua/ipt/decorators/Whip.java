package main.java.ua.ipt.decorators;

import main.java.ua.ipt.component.Beverage;

/**
 * Created by Roman Horilyi on 04.09.2016.
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case "small":   return .5 + beverage.cost();
            case "medium":  return .10 + beverage.cost();
            case "large":   return .13 + beverage.cost();
            default:        return .10 + beverage.cost();
        }
    }
}
