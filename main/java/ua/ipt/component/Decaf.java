package main.java.ua.ipt.component;

/**
 * Created by Roman Horilyi on 04.09.2016.
 */
public class Decaf extends Beverage {
    public Decaf(String size) {
        description = "Decaf Coffee";
        setSize(size);
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case "small":   return .90;
            case "medium":  return 1.05;
            case "large":   return 1.25;
            default:        return 1.05;
        }
    }
}
