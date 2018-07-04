#include<cstdio>
#include<algorithm>
using namespace std;
long long n, plus, minus;
long long a[200010], b[200010];

int main()
{
    // 正の数と負の数がトントンになるタイミングをはかる
    plus = 0;
    minus = 0;

    scanf("%lld", &n);
    for (int i = 0; i < n; ++i)
    {
        scanf("%lld", &a[i]);
        b[i] = a[i] - i;
    }

    sort(b, b+n);
    long long cen = b[n/2];

    long long ans = 0;
    for (int i = 0; i < n; ++i)
    {
        ans += abs(b[i] - cen);
    }

    printf("%lld\n", ans);
    return 0;
}
