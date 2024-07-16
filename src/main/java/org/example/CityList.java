package org.example;

import java.util.ArrayList;
import java.util.List;

public class CityList {
    private final List<City> cities;

    public CityList() {
        cities = new ArrayList<>();

        cities.add(new City("New York", 0, 0));
        cities.add(new City("Los Angeles", 3, 4));
        cities.add(new City("Chicago", 1, 2));
        cities.add(new City("Houston", 6, 8));

    }

    public City findCityByName(String name) {
        for (City city : cities) {
            if (city.getName().equalsIgnoreCase(name)) {
                return city;
            }
        }
        return null;
    }
}
