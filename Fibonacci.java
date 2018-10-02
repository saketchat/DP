//Java program for Fibonacci Series using Space 
import java.util.*;
class fibonacci 
{ 
    public static int[] fib(int n) 
    { 
        /* Declare an array to store Fibonacci numbers. */  
    int f[] = new int[n]; //array of size n
    int i,j;
	int sum=0;
       
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0; 
    f[1] = 1; 
      
    for (i = 2; i < n; i++) 
    { 
       /* Add the previous 2 numbers in the series 
         and store it */
        f[i] = f[i-1] + f[i-2]; 
    } 
	for (j = 0; j < n; j++) 
    { 
       /* Add the previous 2 numbers in the series 
         and store it */
        sum+=f[j]; 
    }
       
	System.out.println("Sum: "+sum);   //printing the sum
    return (f);                       //returning the complete array
    } 
  
    public static void main (String args[]) 
    { 
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int a[]=new int[n];
		a=fib(n);
		System.out.print("Elements:\t"+Arrays.toString(a)); 
    } 
}