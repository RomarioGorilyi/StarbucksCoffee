package main.java.ua.ipt.decorators;

import main.java.ua.ipt.component.Beverage;

/**
 * Created by Roman Horilyi on 03.09.2016.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();

    /**
     * Round (not truncate) a double to specified number of decimal places
     * @param value integer part
     * @param places a number of decimal places
     * @return rounded double value
     */
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
