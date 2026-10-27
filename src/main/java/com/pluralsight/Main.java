package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("employee.csv"));


            bufferedReader.readLine();

            String csvLine;
            while ((csvLine = bufferedReader.readLine()) != null) {
                String[] token = csvLine.split("\\|");
                int employeeId = Integer.parseInt(token[0]);
                String name = token[1];
                double hoursWorked = Double.parseDouble(token[2]);
                double payRate = Double.parseDouble(token[3]);
            }
        } catch (Exception problem) {
            System.out.println("Sorry, something went wrong!");

        }
    }
}
