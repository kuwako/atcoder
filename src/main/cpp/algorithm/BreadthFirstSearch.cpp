#include<iostream>
#include<queue>
using namespace std;
static const int N;
static const int INFTY = (1<<21);

int n, M[N][N];
int d[N];

void bfs(int s)
{
    queue<int> q;
    q.push(s);

    for (int i = 0; i < n; ++i) d[i] = INFTY;
    d[s] = 0;

    int u;
    while (!q.empty()) {
        u = q.front(); q.pop();
        for (int i = 0; i < n; ++i)
        {
            if (M[u][v] == o) continue;
            if (d[v] != INFTY) continue;
            d[v] = d[u] + 1;
            q.push(v);
        }
    }
    for (int i = 0; i < n; ++i)
    {
        cout << i+1 << " " << ((d[i] == INFTY) ? (-1) : d[i]) << endl;
    }
}

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

    bfs(0);
    return 0;
}
