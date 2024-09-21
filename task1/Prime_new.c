/*Question:
Write a recursive program to determine whether a given integer is prime or not.

Input:
49
999983
1

Output:
not prime
prime
not prime
*/

#include <math.h>
#include <stdbool.h>
#include <stdio.h>

int prime_cq(int n, int root_n, int count) {

  if (count == root_n) { /* BASE CASE
                            this if block will active when our count variable
                            will reach sqrt_num
                            in last recursive call
                            determining the number as prime */
    return true;
  }

  if (n % 2 == 0) {
    return false;
  }
  if (n % count == 0) {
    return false;
  }

  return prime_cq(n, root_n, count + 1);
}

int main(void) {

  /*prints whether a number is prime or not*/

  int num = 0; /* user input number*/

  scanf("%d", &num);

  int sqrt_num = (int)sqrt(num); /*square root of num*/

  printf("%d\n", prime_cq(num, sqrt_num, 3));
}
