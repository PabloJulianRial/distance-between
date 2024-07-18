package org.example;

public class DistanceCalculator {
    public static void main(String[] args) {
        Input userInput = new Input();
        CityList cityList = new CityList();

        String city1Name = userInput.getCityInput("Enter the first city: ");
        String city2Name = userInput.getCityInput("Enter the second city: ");

        City city1 = cityList.findCityByName(city1Name);
        City city2 = cityList.findCityByName(city2Name);

        if (city1 == null || city2 == null) {
            System.out.println("One or both cities are not in the list.");
        } else {
            double distance = calculateDistance(city1, city2);
            System.out.println("The distance between " + city1Name + " and " + city2Name + " is " + Math.round(distance) + " km or " + Math.round(distance * 0.621371) + " miles.");
        }
    }

    private static double calculateDistance(City city1, City city2) {
        double x1 = city1.getX();
        double y1 = city1.getY();
        double x2 = city2.getX();
        double y2 = city2.getY();

        return 2 * 6371.0 * Math.asin(Math.sqrt(
                Math.sin(Math.toRadians(x2 - x1) / 2) * Math.sin(Math.toRadians(x2 - x1) / 2) +
                        Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                                Math.sin(Math.toRadians(y2 - y1) / 2) * Math.sin(Math.toRadians(y2 - y1) / 2)
        ));
    }
}
