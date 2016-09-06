package main.java.ua.ipt.decorators;

import main.java.ua.ipt.component.Beverage;

/**
 * Created by Roman Horilyi on 04.09.2016.
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case "small":   return .10 + beverage.cost();
            case "medium":  return .15 + beverage.cost();
            case "large":   return .25 + beverage.cost();
            default:        return .15 + beverage.cost();
        }
    }
}
