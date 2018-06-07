#include <bits/stdc++.h>
typedef long long ll;
typedef unsigned long long ull;
using namespace std;

#define REP(i, n) for (int i = 0, i##_len = (n); i < i##_len; ++i)
#define FOR(i, s, n) for (int i = (s); i < (n); ++i)
#define ALL(x) (x).begin(), (x).end()
#define SZ(x) ((int)(x).size())

ll QP(ll n, ll k, ll mod = 1)
{
    ll ans = 1;
    do
    {
        if (k & 1)
            ans = 1ll * ans * n % mod;
        n = 1ll * n * n % mod;
    } while (k >>= 1);
    return ans;
}
ll GCD(ll a, ll b) { return b ? GCD(b, a % b) : a; }

int main()
{
    int N, D;
    cin >> N >> D;
#ifdef debug
    cout << "N:" << N << ", D:" << D << endl;
    cout << "X:";
#endif

    vector<int> X(N);
    REP(i, N)
    {
        cin >> X[i];
#ifdef debug
        cout << X[i] << ((i < N - 1) ? ' ' : '\n');
#endif
    }

    ll Left, Right;
    ll Answear = 0;

    FOR(j, 1, N - 1)
    {
        Left = lower_bound(ALL(X), X[j] - D) - X.begin();
        Right = upper_bound(ALL(X), X[j] + D) - X.begin();
        Answear += (j - Left) * (Right - j - 1);
#ifdef debug
        cout << "j:" << j << ", Left:" << Left << ", Right:" << Right << endl;
#endif
    }

    FOR(i, 2, N)
    {
        Left = lower_bound(ALL(X), X[i] - D) - X.begin();
        Left = i - Left;

        if (Left > 1)
            Answear -= Left * (Left - 1) / 2;
#ifdef debug
        cout << "i:" << i << ", Left:" << Left << endl;
#endif
    }

    cout << Answear << endl;

    return 0;
}
