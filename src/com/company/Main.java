package com.company;

import java.io.DataInput;
import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a) Declare and initialize an array of 10 integers with the values -10.
        int[] theArray = new int[10];
        for(int index = 0; index<theArray.length; index++)
        {
            theArray[index] = 10;
        }
        // b) Add 1 to each of the 20 elements of an integer array called values
        int[] values = new int[20];
        for (int index = 0; index< values.length; index++)
        {
            values[index]++;
        }

        // c) Read 7 values for a float array called dailyTemperatures from the keyboard.
        float[] dailyTemperatures = new float[7];
        for (int index = 0; index < dailyTemperatures.length; index++)
        {
            dailyTemperatures[index] = input.nextFloat();
        }

        // d) Print the 5 values of an integer array called bestScores in column format.
        int[] bestScores = new int[5];
        for(int index = 0; index <bestScores.length; index++)
        {
            System.out.println(bestScores[index]);
        }
        input.close();
    }
}
