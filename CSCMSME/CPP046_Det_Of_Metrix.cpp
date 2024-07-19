#include <bits/stdc++.h>
#include <vector>
using namespace std;

int determinantOfMatrix(vector<vector<int> > mat) {
    int num1, num2, index;
    int n = mat.size();
    double total = 1.0; // Initialize result
    double det = 1.0;

    // temporary array for storing row
    vector<int> temp(n);

    // loop for traversing the diagonal elements
    for (int i = 0; i < n; i++) {
        index = i; // initialize the index

        // finding the index which has non-zero value
        while (index < n && mat[index][i] == 0) {
            index++;
        }
        if (index == n) { // if there is no non-zero element
            // the determinant of matrix is zero
            return 0;
        }
        if (index != i) {
            // loop for swapping the diagonal element row and index row
            for (int j = 0; j < n; j++) {
                swap(mat[index][j], mat[i][j]);
            }
            // determinant sign changes when we swap rows
            det = det * -1;
        }

        // storing the values of diagonal row elements
        for (int j = 0; j < n; j++) {
            temp[j] = mat[i][j];
        }
        // traversing every row below the diagonal element
        for (int j = i + 1; j < n; j++) {
            num1 = temp[i]; // value of diagonal element
            num2 = mat[j][i]; // value of next row element

            // traversing every column of row
            // and multiplying to every row
            for (int k = 0; k < n; k++) {
                // multiplying to make the diagonal element and next row element equal
                mat[j][k] = (num1 * mat[j][k]) - (num2 * temp[k]);
            }
            total = total * num1; // Det(kA)=kDet(A);
        }
    }

    // multiplying the diagonal elements to get determinant
    for (int i = 0; i < n; i++) {
        det = det * mat[i][i];
    }
    return static_cast<int>(round(det / total)); // Det(kA)/k=Det(A);
}

int main() {
    int size;
    cin >> size;
    if (size > 8) {
        cout << "This program supports up to 8x8 matrices only." << endl;
        return 1;
    }

    vector<vector<int> > matrix(size, vector<int>(size));
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            cin >> matrix[i][j];
        }
    }
    cout << determinantOfMatrix(matrix) << endl;
    return 0;
}
