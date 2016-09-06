package main.java.ua.ipt.component;

/**
 * Created by Roman Horilyi on 04.09.2016.
 */
public class Espresso extends Beverage {
    public Espresso(String size) {
        description = "Espresso";
        setSize(size);
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case "small":   return 1.50;
            case "medium":  return 1.99;
            case "large":   return 2.40;
            default:        return 1.99;
        }
    }
}
