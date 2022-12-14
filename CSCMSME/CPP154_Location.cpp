#include <bits/stdc++.h>
using namespace std;
int rdp[110], cdp[110], n, m, field[110][110];
int main()
{
    cin >> n >> m;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin >> field[i][j];
            rdp[i] += field[i][j];
            cdp[j] += field[i][j];
        }
    }
    int mx = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            mx = max(mx, rdp[i] + cdp[j] - field[i][j]);
        }
    }
    cout << mx << endl;
    return 0;
}