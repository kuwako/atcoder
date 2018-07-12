#include<cstdio>
#include<algorithm>
#include<math.h>
using namespace std;
long long n, m, d;

int main()
{
    scanf("%lld %lld %lld", &n, &m, &d);
    double ret;
    ret = m - 1;
    if (d == 0) {
        ret *= 1.0 / n;
    } else {
        ret *= 2.0 * (n - d) / n / n;
    }

    printf("%.12lf\n", ret);
    return 0;
}
