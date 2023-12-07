//Write a function to print the sum of all odd numbers from 1 to n.

java.util.Scanner;

public class problem2 {

    public static void sumOdd(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                sum = sum +i ;
            }
        }
        System.out.println(sum);
       
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        sumOdd(a);
        
    }
}
