#include <bits/stdc++.h>
using namespace std;
int main() {
     // ios::sync_with_stdio(0);
     // cin.tie(0);
     int n;
     cin >> n;
     int dis;
     cin >> dis;
     double time[n], timesort[n];
     for (int i = 0; i < n; i++) {
          int diffdis, v;
          double tmptime;
          cin >> diffdis >> v;
          
          tmptime = (double)(dis - diffdis) / (double)v;
          time[i] = tmptime;
          timesort[i] = tmptime;
     }
     sort(timesort, timesort + n);
     for (int i = 0; i < n; i++) {
          printf("%.6f ", timesort[i]);
          for (int j = 0; j < n; j++) {
               if (time[j] == timesort[i]) {
                    cout << j + 1 << endl;
                    time[j] = -10e9;
                    break;
               }
          }
     }
     return 0;
}