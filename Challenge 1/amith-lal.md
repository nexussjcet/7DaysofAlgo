# Code
```
import java.util.Scanner;
class PrimeReader{
	boolean isPrime(int x)
	{
		for(int i=2; i<=x/2; i++)
		{
			if (x%i==0) {
				return false;
			}}
		return true;
	}}

public class PrimeC{
public static void main(String[] args) {
		
	PrimeReader test= new PrimeReader();
	
	Scanner ins=new Scanner(System.in);
	System.out.print("Enter a Number: ");
	int x;
	x=ins.nextInt();
	 if(x == 1) {
         System.out.println("1 is not Prime or Composite\n");
      } 
	 else
	 {
		if(test.isPrime(x) ) {
		System.out.println("The number "+x+" is a Prime number\n");
		}
		else{
		System.out.println("The number "+x+" is not a Prime number\n");
		}
	 }
	
}}
```

# Explanation
Create a class to check a natural number.
Create a boolean method to return boolean values.
Using for loop and if statement check the number whether prime or not.
Return Boolean values

Create main class.
Create an object of first class.
Scan the natural number from user.
Check the number using isPrime Method in the first class.
Print the Result.
