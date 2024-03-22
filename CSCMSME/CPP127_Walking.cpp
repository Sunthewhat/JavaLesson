#include <bits/stdc++.h>
using namespace std;
int main() {
     ios::sync_with_stdio(0);
     cin.tie(0);
     int aStart, aDist, bStart, bDist;
     cin >> aStart >> aDist >> bStart >> bDist;
     if (aStart == bStart) {
          cout << "Yes 0";
          return 0;
     }
     if (aDist == bDist) {
          cout << "No";
          return 0;
     }
     if (aDist > bDist && aStart > bStart) {
          cout << "No";
          return 0;
     }
     if (aDist < bDist && aStart < bStart) {
          cout << "No";
          return 0;
     }
     if (aDist > bDist) {
          int x = (aStart - bStart) / (bDist - aDist);
          if (x * (bDist - aDist) == (aStart - bStart)) {
               cout << "Yes " << x;
          } else
               cout << "No";
     } else {
          int x = (bStart - aStart) / (aDist - bDist);
          if (x * (aDist - bDist) == (bStart - aStart)) {
               cout << "Yes " << x;
          } else
               cout << "No";
     }
     return 0;
}