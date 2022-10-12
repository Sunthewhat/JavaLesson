#include <bits/stdc++.h>
using namespace std;
int a[5100], mark[5100], mn = 21, n;
char c[5100];
int sum = 0;
int play(int sum1, int sum2, int state)
{
    if (state == n)
    {
        return abs((long)sum1 - sum2);
    }
    int first = play(sum + a[state], sum2, state + 1);
    int second = play(sum1, sum2 + a[state], state + 1);
    mn = first < second ? first : second;
    return mn;
}
int main()
{
    int i, j, cnt = 0;
    cin >> n;
    for (i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    play(0, 0, 0);
    cout << mn;
    return 0;
}