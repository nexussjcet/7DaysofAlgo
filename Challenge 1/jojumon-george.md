# Code

```

import java.util.*;

public class Main {

    static boolean checkPrime(int n) {

        if (n==1)

           return(false);

        else if(n==2)

           return(true);

        else {

           for(int i=2;i<n/2;i++) { 

                if(n%i==0)

                  return(false);

           }

           return(true);

        }   

    }

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be checked");

        int num= sc.nextInt();

        if(checkPrime(num))

           System.out.println(num+" is a Prime number");

        else

           System.out.println(num+" is not a Prime number");

  sc.close();

    }

}

```

# Explanation

The checkPrime function is used here to check whether the given parameter is Prime or not. First the function checks whether the parameter given is 1 or 2, and returns the result accordingly. 

If not, the function checks whether the given number is prime by dividing the number by 2 and if it gets a reminder, it proves the number is not prime. If not, the function divides the given number by next number, and so on till it gets a reminder. 

If it doesn't get a reminder even after traversing the loop n/2 times, it means the given number is Prime.

The loop is traversed n/2 times instead of n as half the factor table of a number is the co-factor of its other half. Decreasing the number of traverses helps to increase the efficiency of the code.

The loop is traversed n/2 times instead of n as half the factor table of a number is the co-factor of its other half. Decreasing the number of traverses helps to increase the efficiency of the code.
