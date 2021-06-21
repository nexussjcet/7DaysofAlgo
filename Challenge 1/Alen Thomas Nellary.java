/** Challenge 1: Am I prime or not? 
 * 
 * @author Alen Thomas Nellary
 */

import java.util.Scanner;

public class PrimeChecker {
    static boolean isPrime(int num) {
        int i;
		for(i=2; i<=num/2; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int num;
		boolean prime;
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
		num = scanner.nextInt();
		if(num == 1) {
			System.out.println("1 is neither Prime nor Composite!\n");
		} else {
		    prime = isPrime(num);
		    if(prime) {
		    	System.out.println("The number "+num+" is a Prime number\n");
		    } else {
		    	System.out.println("The number "+num+" is not a Prime number\n");
		    }
		}
		scanner.close();
	}
}