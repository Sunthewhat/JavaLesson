#include <bits/stdc++.h>
using namespace std;
char zero[5][5] = {"###", "#.#", "#.#", "#.#", "###"};
char one[5][5] = {"..#", "..#", "..#", "..#", "..#"};
char two[5][5] = {"###", "..#", "###", "#..", "###"};
char three[5][5] = {"###", "..#", "###", "..#", "###"};
char four[5][5] = {"#.#", "#.#", "###", "..#", "..#"};
char five[5][5] = {"###", "#..", "###", "..#", "###"};
char six[5][5] = {"###", "#..", "###", "#.#", "###"};
char seven[5][5] = {"###", "..#", "..#", "..#", "..#"};
char eight[5][5] = {"###", "#.#", "###", "#.#", "###"};
char nine[5][5] = {"###", "#.#", "###", "..#", "###"};
char colon[5][5] = {"...", ".#.", "...", ".#.", "..."};
void printNum(int n, int i, int j);
void printNumVertical(int n);
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    string time;
    int mode;  // 1: vertical 2: horizontal
    cin >> time >> mode;

    if (mode == 1) {
        for (int i = 0; i < time.length(); i++) {
        }
    }

    return 0;
}

void printNumVertical(int n) { char num[5][5]; }