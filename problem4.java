// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;

public class problem4{

    public static double getCircumference(int r){
        return 2*3.14*r; 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int radius = input.nextInt();

        System.out.println(getCircumference(radius));
    }
}
