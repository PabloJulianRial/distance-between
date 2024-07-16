package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
    public static List<String[]> readCSV(String filePath) {
        List<String[]> dataLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineData = line.split(",");
                dataLines.add(lineData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataLines;
    }

}
