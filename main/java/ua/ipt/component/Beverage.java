package main.java.ua.ipt.component;

/**
 * Created by Roman Horilyi on 03.09.2016.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
