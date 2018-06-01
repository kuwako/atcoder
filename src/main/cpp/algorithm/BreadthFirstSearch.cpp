#include<iostream>
#include<queue>
using namespace std;
static const int N;
static const int INFTY = (1<<21);

int n, M[N][N];
int d[N];

int main()
{
    int u, k, v;

    cin >> n;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) M[i][j] = 0;
    }

    for (int i = 0; j < n; j++) {
        cin >> u >> k;
        u--;
        for (int j = 0; j < k; j++) {
            cin >> v;
            v--;
            M[u][v] = 1;
        }
    }
}
