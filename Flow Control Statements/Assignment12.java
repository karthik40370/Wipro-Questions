/*Write a program to check if a given number is prime or not*/



class Assignment12{
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

/*
Can use this code too

public static void main(String[] args) {
Scanner in = new Scanner(System.in);

System.out.print("Enter a number: ");
int n = in.nextInt();

if(isPrime(n))
    System.out.println("Prime");
else
    System.out.println("Not Prime");
}

static boolean isPrime(int n) {
if(n == 0 || n == 1) return false;

int l = (int)Math.sqrt(n);
for(int i=2; i <= l; i++) {
    if(n%i == 0)
        return false;
}
return true;
}
}

*/