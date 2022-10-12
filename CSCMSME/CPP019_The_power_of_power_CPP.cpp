#include <bits/stdc++.h>
using namespace std;
long long rec(long long a, long long b, long long c)
{
    if (b == 0ll)
        return 1ll % c;
    if (b == 1ll)
        return a % c;
    long h = rec(a, b / 2, c);
    long f = (h * h) % c;
    if (b % 2 == 1ll)
        f = (f * a) % c;
    return f;
}
int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    int q;
    cin >> q;
    while (q--)
    {
        long long a, b, c;
        cin >> a >> b >> c;
        cout << rec(a, b, c) << endl;
    }

    return 0;
}