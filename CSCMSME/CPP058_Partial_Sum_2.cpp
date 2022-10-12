#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n, tmp;
    cin >> n;
    int a[n + 10];
    a[0] = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> tmp;
        a[i + 1] = a[i] + tmp;
    }
    int q;
    cin >> q;
    for (int i = 0; i < q; i++)
    {
        int st, en;
        cin >> st >> en;
        cout << a[en + 1] - a[st] << "\n";
    }
    return 0;
}