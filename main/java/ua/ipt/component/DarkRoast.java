package main.java.ua.ipt.component;

/**
 * Created by Roman Horilyi on 04.09.2016.
 */
public class DarkRoast extends Beverage {
    public DarkRoast(String size) {
        description = "Dark Roast Coffee";
        setSize(size);
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case "small":   return .80;
            case "medium":  return .99;
            case "large":   return 1.15;
            default:        return .99; // SHIT !!!
        }
    }
}
