package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner inputData = new Scanner(System.in);
        int numwheels, total;
        System.out.println("Input number of wheels: ");
        numwheels = inputData.nextInt();
        if (numwheels < 5) {
            total = numwheels * 30000;
            System.out.println("Total : $" + total + "unite price: $30.000");
        } else if (numwheels >= 5 && numwheels <= 10) {
            total = numwheels * 25000;
            System.out.println("Total : $" + total + "unite price: $25.000");
        } else if (numwheels > 10) {
            total = numwheels * 20000;
            System.out.println("Total : $" + total + "unite price: $20.000");

        }
    }
}
