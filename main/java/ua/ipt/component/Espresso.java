package main.java.ua.ipt.component;

/**
 * Created by Roman Horilyi on 04.09.2016.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
