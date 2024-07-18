package org.example;

import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);
    private final CityList cityList;

    public Input() {
        cityList = new CityList();
    }

    public String getCityInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim().toLowerCase();
            if (cityList.findCityByName(input) != null) {
                return input;
            } else {
                System.out.println("City not in the list. Please enter another city.");
            }
        }
    }
}
