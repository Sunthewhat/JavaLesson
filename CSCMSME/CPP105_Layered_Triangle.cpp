#include <bits/stdc++.h>
using namespace std;
int a[410][410];
int main() {
     ios::sync_with_stdio(0);
     cin.tie(0);
     int n;
     cin >> n;
     int x = ceil(n / 3.0);
     /*
        1 1 1 1 1 1 1 1 1 / 0 0
          1 2 2 2 2 2 2 1 / 1 1,1 2
            1 2 3 3 3 2 1 / 2 2,2 3,2 4
              1 2 3 3 2 1
                1 2 3 2 1
                  1 2 2 1
                    1 2 1
                      1 1
                        1
     */

     for (int k = 0; k < x; k++) {
          // vertical
          for (int i = k; i < n - 2 * k; i++) {
               a[i][n - k - 1] = k + 1;
          }
          // horizontal
          for (int i = k * 2; i < n - k; i++) {
               a[k][i] = k + 1;
          }
          // axis
          for (int i = k; i < n - k * 2; i++) {
               a[i][i + k] = k + 1;
          }
     }
     for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
               if (a[i][j] == 0) {
                    cout << "  ";
               } else
                    cout << a[i][j] % 10 << " ";
          }
          cout << "\n";
     }
     return 0;
}