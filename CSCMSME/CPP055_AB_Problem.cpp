#include <bits/stdc++.h>
using namespace std;
string A, B, res;
int main() {
     ios::sync_with_stdio(0);
     cin.tie(0);
     cin >> A >> B;
     reverse(A.begin(), A.end());
     reverse(B.begin(), B.end());
     int maxLen = max(A.length(), B.length());
     int leftover = 0;
     for (int i = 0; i < maxLen + 1; i++) {
          int a = i < A.length() ? A[i] - '0' : 0;
          int b = i < B.length() ? B[i] - '0' : 0;
          int sum = a + b + leftover;
          leftover = sum / 10;
          res += (sum % 10) + '0';
     }
     reverse(res.begin(), res.end());
     if (res[0] == '0') res.erase(res.begin());
     cout << res;
     return 0;
}