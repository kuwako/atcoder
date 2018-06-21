#include<iostream>
#include <algorithm>
using namespace std;
#define MAXN 1000
long long n, m, ans, c[MAXN+5][5];

// https://beta.atcoder.jp/contests/abc100/submissions/2709453
int main()
{
    scanf("%lld %lld", &n, &m);
    for (int i = 1; i <= n; ++i)
    {
        scanf("%lld %lld %lld", &c[i][1], &c[i][2], &c[i][3]);
    }

	return 0;
}
