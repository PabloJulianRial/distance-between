package org.example;

public class City {
    private String name;
    private double x;
    private double y;

    public City(String name, String x, String y) {
        this.name = name;
        this.x = Double.parseDouble(x);
        this.y = Double.parseDouble(y);
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
