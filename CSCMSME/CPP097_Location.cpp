#include <bits/stdc++.h>
using namespace std;
vector<string> ans;
int main() {
     ios::sync_with_stdio(0);
     cin.tie(0);
     int n, m, count = 0;
     cin >> n >> m;
     int a[n][m];
     for (int i = 0; i < n; i++)
          for (int j = 0; j < m; j++) cin >> a[i][j];
     for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
               int maxRC = -10000000;
               for (int k = 0; k < n; k++)
                    if (a[k][j] > maxRC) maxRC = a[k][j];
               for (int k = 0; k < m; k++)
                    if (a[i][k] > maxRC) maxRC = a[i][k];
               if (a[i][j] == maxRC) {
                    string a = to_string(i + 1);
                    a = a.append(" ");
                    a = a.append(to_string(j + 1));
                    ans.push_back(a);
                    count++;
               }
          }
     }
     cout << count << endl;
     for (int i = 0; i < ans.size(); i++) cout << ans[i] << endl;
     return 0;
}