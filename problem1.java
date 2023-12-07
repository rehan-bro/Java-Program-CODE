//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class problem1{

    public static double numbersAvarage(double a, double b, double c){
            double average = (a+b+c)/3;

            System.out.println(average);
            return average;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a  = input.nextInt();
        int b  = input.nextInt();
        int c  = input.nextInt();

        numbersAvarage(a,b,c);
        
    }
}