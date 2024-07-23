#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, q;
    cin >> n >> q;

    vector<int> arr(n);
    unordered_map<int, int> m;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
        m[arr[i]]++;
    }

    sort(arr.begin(), arr.end());

    while (q--) {
        int x;
        cin >> x;
        bool found = false;
        for (int i = 0; i < n; i++) {
            int num1 = arr[i];
            int num2 = x - num1;

            if (num1 == num2) {
                if (m[num1] > 1) {
                    found = true;
                    break;
                }
            } else {
                if (m.find(num2) != m.end()) {
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            cout << "Yes\n";
        } else {
            cout << "No\n";
        }
    }

    return 0;
}
