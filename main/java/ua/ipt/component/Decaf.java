package main.java.ua.ipt.component;

/**
 * Created by Roman Horilyi on 04.09.2016.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
