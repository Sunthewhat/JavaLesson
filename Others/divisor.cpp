#include <stdio.h>
int main() {
     int n;
     scanf("%d", &n);
     int divisor = 2;
     while (n != 1) {
          if (n % divisor == 0) {
               printf("%d ", divisor);
               n /= divisor;
          } else
               divisor++;
     }
     return 0;
}