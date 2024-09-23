#include <math.h>
#include <stdio.h>
#include <string.h>

/* strReverse function will reverse a string, takes a pointer of char as
 parameter; returns nothing*/

void strReverse(char *first) {

  int len = strlen(first); /*length of the string*/

  for (int i = 0; i < (len / 2); i++) {

    /*this loop will swap characters between first and last, and will continue
     * in this manner, until middle/center of the string*/

    char temp = first[(len - 1) - i];
    first[(len - 1) - i] = first[i];
    first[i] = temp;
  }
}

int main(void) {

  /*Binary to Decimal Converter*/

  char inputted_binary[101] = {0}; /*user input binary number as a string*/
  int decimal_num = 0; /*variable for storing output decimal number*/

  printf("Input Binary Number : ");
  scanf("%[^\n]s", inputted_binary);

  strReverse(inputted_binary);

  for (int i = 0; inputted_binary[i] != '\0'; i++) {

    /*loop for iterative process of converting each positional binary number to
     * corresponding decimal*/

    decimal_num += (int)(inputted_binary[i] - '0') * (int)pow(2, i);
  }

  printf("decimal = %d", decimal_num);

  return 0;

} // DONE
