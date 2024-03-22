#include <bits/stdc++.h>
using namespace std;
int main() {
     ios::sync_with_stdio(0);
     cin.tie(0);
     int x, y, n;
     cin >> x >> y >> n;
     // find max k
     // where 0 <= k <= n and k % x == y
     // ex input 7 5 12345
     // output 12339 (from 7 * 1762 + 5)
     double biggest = (n * 1.0) / (x * 1.0);
     int bb;
     bb = floor(biggest);
     int k = bb * x + y;
     while (k > n) {
          k -= x;
     }
     if (k >= 0) {
          cout << k;
     } else
          cout << 0;
     return 0;
}