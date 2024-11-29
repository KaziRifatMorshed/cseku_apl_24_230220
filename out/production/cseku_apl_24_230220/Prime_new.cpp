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

/*check_prime fn returns true if the number n is prime,
and false for vice versa;

check_prime is implemented in recursive manner;
takes integer n as the number to be tested;
integer root_n is passed to avoid determining root in each recursive call;
integer count which is incremented in each call, used for iteration, to
determine whether (n % count == 0) is true or not
*/

bool check_prime(int n, int root_n, int count) {

  if ((n <= 1)) { /*corner case*/
    return false;
  }

  if ((n == 2) || (n == 3)) { /*corner case*/
    return true;
  }

  if ((n % 2 == 0)) { /*even numbers are not prime*/
    return false;
  }

  if (count > root_n) {
    /* BASE CASE
        this if block will active when our count variable
        will cross sqrt_num
        in last recursive call
        determining the number as prime */
    return true;
  }

  if (n % count == 0) { /*count will increase with each recursive
            call; if num gets divided by count, it is not prime*/
    return false;
  }

  return check_prime(n, root_n, count + 1); /*recursive call, increasing count*/
}

int main(void) {

  /*prints whether a number is prime or not*/

  int num = 0; /* user input storing variable*/

  scanf("%d", &num);

  int sqrt_num = (int)sqrt(num); /*square root of num*/

  if (check_prime(num, sqrt_num, 3) == true) {
    printf("prime");
  } else {
    printf("not prime");
  }
}
