#include <iostream>
using namespace std;
int N, D, X[100009];
int main() {
	cin.tie(0);
	ios_base::sync_with_stdio(false);
	cin >> N >> D;

	for (int i = 0; i < N; ++i) cin >> X[i];

    // 組み合わせの数
	long long ans = 1LL * N * (N - 1) * (N - 2) / 6;

	int pl = 0, pr = 0;

	for (int i = 0; i < N; i++) {
		while (pr != N && X[pr] - X[i] <= D) pr++;
		while (pl != N && X[i] - X[pl] > D) pl++;

		ans -= 1LL * (pr - i - 1) * (pr - i - 2 + pl * 2) / 2 + 1LL * (N - pr) * i;
	}
	cout << ans << '\n';
	return 0;
}
