package main.java.ua.ipt.component;;

/**
 * Created by Roman Horilyi on 04.09.2016.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
