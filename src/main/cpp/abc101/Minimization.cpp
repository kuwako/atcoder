#include<iostream>
#include <algorithm>
using namespace std;
long long n, k, a[100010];

int main() {
    cin >> n >> k;

    long long ans;
    ans = (n-1) / (k-1);
    if ((n-1) % (k-1) != 0) ans++;

    printf("%lld\n", ans);
    return 0;
}
