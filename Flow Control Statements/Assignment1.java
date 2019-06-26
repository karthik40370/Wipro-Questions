/*  Write a program to check if a given integer number is Positive, Negative, or Zero.  */



public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Integer a = Integer.parseInt(args[0]);
		
		
		if(a>0)
			System.out.println("The given number is positive");
		if(a<0)
			System.out.println("The given number is negative");
		else
			System.out.println("THe given number is zero");
	}

}