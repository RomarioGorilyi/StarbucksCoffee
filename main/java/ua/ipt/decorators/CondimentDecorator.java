package main.java.ua.ipt.decorators;

import main.java.ua.ipt.component.Beverage;

/**
 * Created by Roman Horilyi on 03.09.2016.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
