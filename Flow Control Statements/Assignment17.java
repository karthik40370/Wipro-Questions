 /*Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001*/


public class Assignment17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ip = sc.nextInt(); // 1234
		int op = 0; // 4321
		int i = (int) Math.pow(10, String.valueOf(ip).length() - 1);
		
		while (ip != 0) {
			int digit = ip % 10;
			op += digit * i;
			i /= 10;
			ip /= 10;
		}
		
		System.out.println(op);
		
		sc.close();
	}

}