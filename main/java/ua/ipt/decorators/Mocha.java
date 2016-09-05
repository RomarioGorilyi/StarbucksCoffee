package main.java.ua.ipt.decorators;

import main.java.ua.ipt.component.Beverage;

/**
 * Created by Roman Horilyi on 04.09.2016.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
