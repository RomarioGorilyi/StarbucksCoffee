package main.java.ua.ipt.component;

/**
 * Created by Roman Horilyi on 03.09.2016.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    private String size;

    public String getDescription() {
        return description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {
            this.size = size.toLowerCase();
        } else {
            throw new IllegalArgumentException("Incorrect size of a beverage.");
        }
    }

    public abstract double cost();
}