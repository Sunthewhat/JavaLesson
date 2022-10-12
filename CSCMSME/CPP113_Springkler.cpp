#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n, m;
    cin >> n >> m;
    int field[n + 10][m + 10];
    int dprow[n + 100], dpcol[m + 100];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin >> field[i][j];
            dpcol[j] += field[i][j];
            dprow[i] += field[i][j];
        }
    }
    int mx = 0;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            mx = max(mx, dpcol[j] + dprow[i] - field[i][j]);
        }
    }
    cout << mx;
    return 0;
}