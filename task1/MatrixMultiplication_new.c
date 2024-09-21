#include <stdio.h>
#define print_new_line printf("\n");

void MultiplyMatrix(int m, int n, int k, float *A, float *B, float *C) {

  /* this fn multiplies two matrix(2D array) and store them in third
      2D array. It takes parameter m as the row num of matrix A,
      n as column number of matrix A or row number of matrix B,
      k as column number of matrix C,
      takes three floating pointer as matrices, does not return anything*/

  for (int row = 0; row < m; row++) {
    for (int col = 0; col < k; col++) {

      float sum = 0;

      for (int i = 0; i < n; i++) {
        float a = A[row * n + i];
        float b = B[i * k + col];
        sum += a * b;
      }

      C[row * k + col] = sum;
    }
  }
}

int main(void) {

  /*this program multiplies two matrix and store result
    in a 2D array of float*/

  float A[3][3] = {{2, 3, 4}, {3, 5, 6}, {4, 5, 3}};
  float B[3][3] = {{1, 2, 1}, {-1, 2, 1}, {3, 2, 1}};
  float C[3][3] = {0};

  MultiplyMatrix(3, 3, 3, (float *)A, (float *)B, (float *)C);

  printf("Matrix Multiplication in C\nPrinting Result:\n");

  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      printf("%2.2f\t", C[i][j]);
    }
    print_new_line;
  }
}