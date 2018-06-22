#include<iostream>
#include<vector>
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

    for (int i = 0; i < 8; i++) {
        vector <long long> vec;
        for (long long j = 1; j <= n; j++) {
            long long s = 0;
            for (long long k = 1; k <= 3; k++) {
                
            }
        }
    }

	return 0;
}
