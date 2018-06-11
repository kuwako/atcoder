#include<iostream>
using namespace std;
static const int MAX = 100;
static const int INFTY = (1<<21);
static const int WHITE = 0;
static const int GRAY = 1;
static const int BLACK = 2;

int n, M[MAX][MAX];

int prim() {
    
}

int main() {
    cin >> n;

    for (int i=0; i<n; i++) {
        for (int j = 0; j < n; ++j)
        {
            int e; cin >> e;
            M[i][j] = (e == -1) ? INFTY : e;
        }
    }

    cout << prim() << endl;
    return 0;
}
