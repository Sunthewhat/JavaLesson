#include <bits/stdc++.h>
using namespace std;
map<int, int> A;
map<int, int> B;
int main() {
     ios::sync_with_stdio(0);
     cin.tie(0);
     int n, q;
     cin >> n >> q;
     for (int i = 0; i < n; i++) {
          int x;
          cin >> x;
          B[x]++;
     }
     while (q--) {
          A = B;
          int x;
          bool flag = false;
          cin >> x;
          for (auto i : A) {
               if (A[i.first] == 0) continue;
               if (A[x - i.first] > 0) {
                    if (x - i.first == i.first) {
                         if (A[i.first] > 1) {
                              cout << "Yes\n";
                              flag = true;
                              break;
                         } else
                              continue;
                    } else {
                         cout << "Yes\n";
                         flag = true;
                         break;
                    }
               }
          }
          if (!flag) cout << "No\n";
     }
     return 0;
}