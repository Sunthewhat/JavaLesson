#include <bits/stdc++.h>
using namespace std;
int main() {
     int *p;
     int q;
     p = new int;
     *p = 50;
     cout << p<<endl << *p;
     q = *p;
     delete p;
     return 0;
}