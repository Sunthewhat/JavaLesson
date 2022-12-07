#include <bits/stdc++.h>
#define setp(n) fixed << setprecision(n)
using namespace std;
long long factorial(long long n)
{
    if (n == 1)
        return 1;
    else
        return (n * factorial(n - 1));
}
int main()
{

    long long n, r;
    cin >> n >> r;
    cout << factorial(n) % 1000000007 / (factorial(n - r) % 1000000007 * factorial(r) % 1000000007) << endl;
    return 0;
}