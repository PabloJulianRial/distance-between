package org.example;

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CityList cityList = new CityList();

        System.out.println("Enter the first city: ");
        String city1Name = scanner.nextLine();

        System.out.println("Enter the second city: ");
        String city2Name = scanner.nextLine();

        City city1 = cityList.findCityByName(city1Name);
        City city2 = cityList.findCityByName(city2Name);

        if (city1 == null || city2 == null) {
            System.out.println("One or both cities are not in the list.");
        } else {
            double distance = calculateDistance(city1, city2);
            System.out.println("The distance between " + city1Name + " and " + city2Name + " is " + distance);
        }
    }

    private static double calculateDistance(City city1, City city2) {
        int x1 = city1.getX();
        int y1 = city1.getY();
        int x2 = city2.getX();
        int y2 = city2.getY();

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
