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
    int edge = len * 2 - 1;
    if (len % 2 == 0) {
        cout << "ERROR";
        return 0;
    }
    for (int l = len - 1; l >= 0; l--) {
        // left
        for (int i = l; i < edge - l; i++) {
            field[i][l] = s[l];
        }
        // right
        for (int i = l; i < edge - l; i++) {
            field[i][edge - l - 1] = s[l];
        }
        // top
        for (int i = l; i < edge - l; i++) {
            field[l][i] = s[l];
        }
        // bottom
        for (int i = l; i < edge - l; i++) {
            field[edge - l - 1][i] = s[l];
        }
    }

    for (int i = 0; i < edge; i++) {
        for (int j = 0; j < edge; j++) {
            if (!field[i][j]) {
                cout << ".";
            } else {
                cout << field[i][j];
            }
        }
        cout << "\n";
    }
    return 0;
}