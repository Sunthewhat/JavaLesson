#include <bits/stdc++.h>
using namespace std;
int main()
{
    char a[200];
    cin >> a;
    int len = strlen(a);
    int sz = (len * 2) - 1;
    char ans[sz][sz];
    bool ch[sz][sz];
    for (int k = 0; k < len; k++)
    {
        for (int i = 0; i < sz; i++)
        {
            for (int j = 0; j < sz; j++)
            {
                if (j == k && i < sz - k && i >= k)
                {
                    
                }
            }
            cout << "\n";
        }
        cout << endl;
    }
    return 0;
}