/*
 Write a program to print the sum of all the digits of a given number.

Example1) 
I/P:1234
O/P:10

*/
import java.util.Scanner;

class Assignment15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int tmp = n, sum = 0;

        while(n > 0) {
            sum += n%10;
            n /= 10;
        }

        System.out.println(tmp + "->" + sum);
    }
}

