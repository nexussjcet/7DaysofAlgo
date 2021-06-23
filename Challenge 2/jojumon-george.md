# Code

```

Java

import java.util.*;

public class NumToWord {

	static String numberRecog(int n)	{

		if(n==0)

			return("zero");

		else if(n==100)

			return("hundred");

		else if(n==1000)

			return("thousand");

		int num=n;

		int []a=new int[10];

		String word = "";

		String[] deci = {"","one","two","three","four","five","six","seven","eight", "nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

		String[] sect = {"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

		for(int i=0;n!=0;i++)

		{

			a[i]=n%10;

			n=n/10;

		}

		if(num>0 && num<20)

			word = deci[num];

		else if(num>19 && num<100)

			word = sect[a[1]]+" "+deci[a[0]];

		else if(num>100 && num<1000)

			word = deci[a[2]]+" hundred "+sect[a[1]]+" "+deci[a[0]];

		return word;

	}	

	

	public static void main(String[] args)

	{

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter number");

		int n= sc.nextInt();

		System.out.println(numberRecog(n));

		sc.close();

	}

}

   

```

# Explanation

The function first verifies if the provided number is 0, 100, or 1000. If so, then it returns the value accordingly.

Else, the number is run through a loop with modulus to Store each digit in the number seperately.

Later, if the number is less than 20, the first section of the word is concluded from the array which stores the the ten's values(dect), while the second part of the word is found out from the the array which stores decimal values (sect).
