package org.example;

public class City {
    private String name;
    private int x;
    private int y;

    public City(String name, String x, String y) {
        this.name = name;
        this.x = Integer.parseInt(x.toString());
        this.y = Integer.parseInt(y.toString());
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
