package main.java.ua.ipt.component;

/**
 * Created by Roman Horilyi on 04.09.2016.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
