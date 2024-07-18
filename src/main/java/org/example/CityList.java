package org.example;

import java.util.ArrayList;
import java.util.List;

public class CityList {
    private final List<City> cities;

    public CityList() {
        cities = new ArrayList<>();

        String filepath = "src/cities.csv";
        List<String[]> dataLines = FileRead.readCSV(filepath);

        for (String[] line : dataLines) {
            cities.add(new City(line[0], line[1], line[2]));
        }
    }

    public List<City> getCities() {
        return cities;
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
