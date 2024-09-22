#include <stdio.h>
#define print_new_line printf("\n");

const int MAX_ROW = 3; /*limiting this problem applicable for 3x3 matrix*/
const int MAX_COL = 3; /*limiting this problem applicable for 3x3 matrix*/

void MultiplyMatrix(int m, int n, int k, float *A, float *B, float *C) {

  /* this fn multiplies two matrix(2D array) and store them in third
      2D array. It takes parameter m as the row num of matrix A,
      n as column number of matrix A or row number of matrix B,
      k as column number of matrix C,
      takes three floating pointer as matrices, does not return anything*/

  for (int row = 0; row < m; row++) {
    for (int col = 0; col < k; col++) {

      float sum = 0; /*variable for storing sum of multiplying elements*/

      for (int i = 0; i < n; i++) {
        sum += A[row * n + i] * B[i * k + col];
      }

      C[row * k + col] = sum; /*setting value to resultant matrix*/
    }
  }
}

int main(void) {

  /*this program multiplies two matrix and store result
    in a 2D array of float*/

  float A[3][3] = {0};
  float B[3][3] = {0};
  float C[3][3] = {0};

  printf("input 3x3 matrix A:\n");
  for (int i = 0; i < MAX_ROW; i++) {
    for (int j = 0; j < MAX_COL; j++) {
      scanf("%f", &A[i][j]);
    }
  }
  print_new_line;
  printf("input 3x3 matrix B:\n");
  for (int i = 0; i < MAX_ROW; i++) {
    for (int j = 0; j < MAX_COL; j++) {
      scanf("%f", &B[i][j]);
    }
  }

  MultiplyMatrix(MAX_ROW, MAX_COL, MAX_ROW, (float *)A, (float *)B, (float *)C);

  printf("Result:\n");

  /* print output matrix*/
  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      printf("%2.2f\t", C[i][j]);
    }
    print_new_line;
  }
}