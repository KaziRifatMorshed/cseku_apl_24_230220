#include <stdio.h>
#define print_new_line printf("\n");
#define print_space printf(" ");

int main(void) {

  /* program for printing pyramid of number; example:
         1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
*/

  int num = 0; /* this variable will store user input: the number of rows*/

  printf(" input num of rows : ");
  scanf("%d", &num);

  for (int i = 1; i <= num; i++) {

    /*loop for printing each line/row */

    for (int j = 0; j <= (num - i); j++) {

      /*loop for printing whitespaces appeared before each number*/

      print_space;
    }

    for (int j = 1; j <= i; j++) {
      printf("%d ", j);
    }

    print_new_line;
  }
}
