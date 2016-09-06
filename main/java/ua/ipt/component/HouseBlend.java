package main.java.ua.ipt.component;

/**
 * Created by Roman Horilyi on 04.09.2016.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(String size) {
        description = "House Blend Coffee";
        setSize(size);
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case "small":   return .70;
            case "medium":  return .89;
            case "large":   return 1.15;
            default:        return .89;
        }
    }
}
