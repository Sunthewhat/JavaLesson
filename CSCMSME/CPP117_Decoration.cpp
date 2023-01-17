#include <bits/stdc++.h>
using namespace std;
int main() {
     int n, m;
     cin >> n >> m;
     int decor[n];
     for (int i = 0; i < n; i++) cin >> decor[i];
     for (int i = 0; i < m; i++) {
          sort(decor, decor + n);
          int p;
          bool ch = false;
          cin >> p;
          for (int j = 0; j < n; j++) {
               if (p <= decor[j]) {
                    cout << decor[j];
                    decor[j] = -1;
                    ch = true;
                    break;
               }
          }
          if (!ch) cout << -1;
          cout << "\n";
     }
     return 0;
}