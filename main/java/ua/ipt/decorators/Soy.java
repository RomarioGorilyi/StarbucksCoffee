package main.java.ua.ipt.decorators;

import main.java.ua.ipt.component.Beverage;

/**
 * Created by Roman Horilyi on 04.09.2016.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
