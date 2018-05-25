#include<cstdio>
#include<algorithm>
using namespace std;
int n,m;

int main()
{
    scanf("%d %d", &n,&m);
    int g[n+1][n+1];
    for (int i = 1; i <= m; i++) {
        int l,r,d; scanf("%d %d %d",&l,&r,&d);
        if (g[l][r] == 0) {
            g[l][r] = d;
            g[r][l] = -1 * d;
        } else if (g[l][r] != d) {
            puts("No");
            return 0;
        }
    }

    puts("Yes");
    return 0;
}
