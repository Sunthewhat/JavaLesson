#include <bits/stdc++.h>
using namespace std;
int ans[10000000];
int main()
{
    int n, q;
    cin >> n >> q;
    double x[n], y[n], r[n];
    for (int i = 0; i < n; i++)
    {
        cin >> x[i] >> y[i] >> r[i];
    }
    for (int i = 0; i < q; i++)
    {
        double xp, yp;
        cin >> xp >> yp;
        for (int j = 0; j < n; j++)
        {
            double dis = sqrt(pow(x[j] - xp, 2) + pow(y[j] - yp, 2));
            if (r[j] >= dis)
                ans[i]++;
        }
    }
    for (int i = 0; i < q; i++)
    {
        cout << ans[i] << endl;
    }
    return 0;
}