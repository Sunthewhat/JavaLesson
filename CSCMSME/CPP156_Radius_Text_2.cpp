#include <bits/stdc++.h>
using namespace std;
char field[220][220];
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    string s;
    cin >> s;
    transform(s.begin(), s.end(), s.begin(), ::tolower);
    int len = s.length();
    for (int i = 0; i < len; i++) {
        for (int j = 0; j < len; j++) {
            if (j < i) {
                cout << s[i];
            } else {
                cout << s[j];
            }
        }
        cout << "\n";
    }
    return 0;
}