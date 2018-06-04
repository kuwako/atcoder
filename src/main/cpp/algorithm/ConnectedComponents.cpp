#include<iostream>
#include<vector>
#include<stack>
using namespace std;
static const int MAX = 100000;
static const int NIL = -1;

int n;
vector<int> G[MAX];
int color[MAX];

void dfs(int r, int c)
{

}

void assignColor()
{
    int id = 1;
    for (int i=0; i<n; i++) color[i] = NIL;
    for (int u=0; u<n; u++) {
        if (color[u] == NIL) dfs(u, id++);
    }

}

int main()
{
    int s, t, m, q;
    cin >> n >> m;
    for (int i=0; i<m; i++) {
        cin >> s >> t;
        G[s].push_back(t);
        G[t].push_back(s);
    }

    assignColor();

    cin >> q;

    for (int i=0; i<q; i++) {
        cin >> s >> t;
        if (color[s] == color[t]) {
            count << "yes" << endl;
        } else {
            count << "no" << endl;
        }
    }
}
