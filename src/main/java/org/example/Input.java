package org.example;

import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);


    public String getCityInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim().toLowerCase();
    }
}
