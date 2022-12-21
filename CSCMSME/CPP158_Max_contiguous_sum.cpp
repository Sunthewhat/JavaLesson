#include <bits/stdc++.h>
using namespace std;
int dp[1100];

int main() {
     int n, range;
     cin >> n >> range;
     dp[0] = 0;
     int a[n];
     for (int i = 1; i <= n; i++) {
          int tmp;
          cin >> tmp;
          dp[i] = dp[i - 1] + tmp;
     }
     int mx = -10e9;
     for (int i = range; i <= n; i++) {
          mx = max(mx, dp[i] - dp[i - range]);
     }
     cout << mx;
     return 0;
}