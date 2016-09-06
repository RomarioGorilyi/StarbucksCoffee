package main.java.ua.ipt.decorators;

import main.java.ua.ipt.component.Beverage;

import java.text.DecimalFormat;

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
        double result = 0;
        switch (getSize()) {
            case "small":   result = .10 + beverage.cost();
            case "medium":  result = .15 + beverage.cost();
            case "large":   result = .25 + beverage.cost();
        }
        return round(result, 2);
    }
}
