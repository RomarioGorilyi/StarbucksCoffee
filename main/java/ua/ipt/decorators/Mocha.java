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
        double result = 0;
        switch (getSize()) {
            case "small":    result = .15 + beverage.cost();
            case "medium":   result = .20 + beverage.cost();
            case "large":    result = .25 + beverage.cost();
        }
        return round(result, 2);
    }
}
