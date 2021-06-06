/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex21;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int num = myApp.getNumber();
        String month = myApp.getMonth(num);
        String outputString = myApp.generateOutputString(month);
        myApp.printOutput(outputString);
    }

    public int getNumber() {
        System.out.print("Please enter the number of the month: ");
        return in.nextInt();
    }

    public String getMonth(int num) {

        switch (num) {
            case 1 -> {
                return "January";
            }
            case 2 -> {
                return "February";
            }
            case 3 -> {
                return "March";
            }
            case 4 -> {
                return "April";
            }
            case 5 -> {
                return "May";
            }
            case 6 -> {
                return "June";
            }
            case 7 -> {
                return "July";
            }
            case 8 -> {
                return "August";
            }
            case 9 -> {
                return "September";
            }
            case 10 -> {
                return "October";
            }
            case 11 -> {
                return "November";
            }
            case 12 -> {
                return "December";
            }
        }
        return "Not a month";
    }

    public String generateOutputString(String month) {
        return "The name of the month is "+month+".";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }

}




