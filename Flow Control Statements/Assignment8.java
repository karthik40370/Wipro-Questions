/*
Write a program to receive a color code from the user (an Alphabhet). 

The program should then print the color name, based on the color code given. 

The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 

If color code provided by the user is not valid then print "Invalid Code". 

*/
import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] input)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a color code: ");
        String ch;
        ch = in.nextLine();
        
        switch(ch) {
        case 'R': System.out.println("Red");
        break;
        case 'G': System.out.println("Green");
        break;
        case 'B': System.out.println("Blue");
        break;
        case 'O': System.out.println("Orange");
        break;
        case 'Y': System.out.println("Yellow");
        break;
        case 'W': System.out.println("White");
        break;
        default: System.out.println("Invalid Code");
    }
        
        
    }
    
    }