#include <bits/stdc++.h>
using namespace std;
int bucket[110000];
int dp[110000];
int main()
{
    int n, q;
    cin >> n >> q;
    int start_range, end_range;
    for (int i = 0; i < q; i++)
    {
        cin >> start_range >> end_range;
        bucket[start_range - 1]++;
        bucket[end_range]--;
    }
    dp[0] = bucket[0];
    cout << dp[0] << " ";
    for (int i = 1; i < n; i++)
    {
        dp[i] = dp[i - 1] + bucket[i];
        cout << dp[i] << " ";
    }
    cout << endl;
    return 0;
}