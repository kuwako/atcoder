#include<iostream>
#include<vector>
#include <algorithm>
using namespace std;
#define MAXN 1000
long long n, m, ans, c[MAXN+5][5];

// 参考: https://beta.atcoder.jp/contests/abc100/submissions/2709453
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
            for (int k = 1; k <= 3; k++) {
                // & はbit単位のAND
                // << は bitを左にシフト
                printf("%d %lld %d %d %d\n", i, j, k, 1 << (k - 1), i & i << (k - 1));
                FILE *fp;
                fp = fopen ("filename.txt","w");
                if (fp!=NULL)
                {
                    fprintf(fp,"Some String\n");
                    fclose (fp);
                }
                if( ( i & (1 << (k-1) ) ) > 0) {
                    s += c[j][k];
                } else {
                    s -= c[j][k];
                }
            }
            vec.push_back(s);
        }
        sort(vec.begin(),vec.end());
		long long a = 0;
		for(long long i = 1; i <= m; i++)
			a += vec[vec.size() - i];
		ans = max(ans,a);
    }
    printf("%lld",ans);

	return 0;
}
