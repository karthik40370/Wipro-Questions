/*
Write a Java program to find if the given number is prime or not.

Example1)
C:\>java Sample 
O/P: Please enter an integer number 

Example2)
C:\>java Sample 1
O/P:1 is neither prime nor composite

Example3)
C:\>java Sample 0
O/P: 0 is neither prime nor composite
 
Example4)
C:\>java Sample 10
O/P: 10 is not a prime number

Example5)
C:\>java Sample 7
O/P : 7 is a prime number

*/

class Assignment14{
    public static void main(String args[])
	 {    
		  int i,m=0,flag=0;      
		  int n=3;  
		  m=n/2;      
		  if(n==0||n==1)
		  {  
		   System.out.println(n+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=m;i++)
		   {      
		    if(n%i==0)
		    {      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  
		   {
			   System.out.println(n+" is prime number"); 
		   
		   }  
		  } 
		  
		} 
	 
		}   