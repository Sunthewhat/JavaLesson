#include <bits/stdc++.h>
using namespace std;
int pow2(int n) {
     if (n == 1) return 2;
     return 2 * pow2(n - 1);
}
int main() {
     ios::sync_with_stdio(0);
     cin.tie(0);
     int n;
     cin >> n;
     int x = pow2(n);
     cout << x;
     return 0;
}