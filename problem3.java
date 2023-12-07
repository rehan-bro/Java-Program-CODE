//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class problem3 {

    public static void getGreater(int a,int b){
        if(a>b){
            System.out.printf("%d > %d",a,b);
        }
        else {
            System.out.printf("%d > %d",b,a);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        getGreater(x,y);
    }
}
