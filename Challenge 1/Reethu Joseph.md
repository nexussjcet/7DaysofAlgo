#include <stdio.h>
int main() {
  int n, i, flag = 0;
  printf("Enter a positive integer: ");
  scanf("%d", &n);
  for (i = 2; i <= n / 2; ++i) {
    if (n % i == 0) {
      flag = 1;
      break;
    }
  }
  if (n == 1) {
    printf("1 is neither prime nor composite.");
  } 
  else {
    if (flag == 0)
      printf("%d is a prime number.", n);
    else
      printf("%d is not a prime number.", n);
  }
  return 0;
}



///Explanation//

In the program, a for loop is iterated from i = 2 to i < n/2.
In each iteration, whether n is perfectly divisible by i is checked using:
if (n % i == 0) {
    flag = 1;
    break;
}
If n is perfectly divisible by i, n is not a prime number. In this case, flag is set to 1, and the loop is terminated using the break statement.we have initialized flag as 0 during the start of our program.So, if n is a prime number after the loop, flag will still be 0. However, if n is a non-prime number, flag will be 1.
