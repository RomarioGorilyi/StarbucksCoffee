package main.java.ua.ipt;

import main.java.ua.ipt.component.Beverage;
import main.java.ua.ipt.component.DarkRoast;
import main.java.ua.ipt.component.Espresso;
import main.java.ua.ipt.component.HouseBlend;
import main.java.ua.ipt.decorators.Mocha;
import main.java.ua.ipt.decorators.Soy;
import main.java.ua.ipt.decorators.Whip;

/**
 * Created by Roman Horilyi on 04.09.2016.
 */
public class StarbucksCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso("small");
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast("Large");
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend("MEDIUM");
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
