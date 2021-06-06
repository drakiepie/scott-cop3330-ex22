package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Exercise 22 Solution
 *  Copyright 2021 Drake Scott
 */

public class ex22 {
    static Scanner input = new Scanner(System.in);

    //method with algorithm to see which value of an array is the max value.
    public static double algorithm(double array[]){
        double max = array[0];
        int i;
        for(i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    //method to see if, within an array, two or more values are equal.
    public static boolean checkEquality(double array[]){
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i]==array[j]){
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {

        double numbers[] = new double[3];
        System.out.print("Enter the first number: ");
        numbers[0] = input.nextDouble();
        System.out.print("Enter the second number: ");
        numbers[1] = input.nextDouble();
        System.out.print("Enter the third number: ");
        numbers[2] = input.nextDouble();

        if(checkEquality(numbers)) {
            System.out.println("Two or more values are equal.");
        }
        else {
            double max = algorithm(numbers);
            System.out.println("The largest number is " + max + ".");
        }
    }

}
