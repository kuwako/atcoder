#include<cstdio>
#include<algorithm>
using namespace std;
typedef long long ll;

int main()
{
    ll n; scanf("%lld", &n);
    char f[300000]; scanf("%s", f);
    ll ans = 300000;
    ll right = 0;
    ll left = 0;

    // 位置xのときの左側のWの数 + 右側のEの数
    for (ll i=0; i<n; i++) {
        if (f[i] == 'E') right++;
    }

    for (ll i=0; i<n; i++) {
        if (f[i] == 'E') {
            right--;
        }
        if (left + right < ans) {
            ans = left + right;
        }
        if (f[i] == 'W') {
            left++;
        }
    }
    printf("%lld", ans);

    return 0;
}
