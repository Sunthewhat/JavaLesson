#include <bits/stdc++.h>
using namespace std;

int fib(int node, int find, int count);

int main() {
     ios::sync_with_stdio(0);
     cin.tie(0);
     int n, x;
     cin >> n >> x;
     cout << fib(n, x, 0);
     return 0;
}

int fib(int node, int find, int count) {
     if (node == 0) {
          if (find == 0) {
               return 1;
          } else
               return 0;
     }
     if (node == 1) {
          if (find == 1) {
               return 1;
          } else
               return 0;
     }
     int match = 0;
     if (node == find) {
          match = 1;
     }
     return match + fib(node - 1, find, count) + fib(node - 2, find, count);
}