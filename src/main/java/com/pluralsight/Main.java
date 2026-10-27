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
                double grossPay = hoursWorked * payRate;

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                System.out.printf("%d: %s, %.2f, %.2f%n",
                        employee.getEmployeeId(),employee.getName(),employee.getHoursWorked(),employee.getPayRate());
                System.out.println(name + " " + grossPay);
            }
            bufferedReader.close();

        } catch (Exception problem) {
            System.out.println("Sorry, something went wrong!");

        }
        System.out.println();
    }
}
