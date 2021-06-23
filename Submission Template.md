# Code
#include <stdio.h>
int isPrime (int num)
{
  int i, flag = 0;
  for (i = 2; i<= num/2;i++) {
    if (num % i == 0) {
      flag = 1;
      break;
    }
  }

  if (num == 1) {
    printf("False");
  } 
  else {
    if (flag == 0)
      printf("True");
    else
      printf("False");
  }
}
int main() {
	isPrime(7);
return 0;
}


# Explanation
1.Take the number,num.
2.check if the number is divisible by any value 2 to number/2. if divisible then it is not prime.
3.Else it is prime.
