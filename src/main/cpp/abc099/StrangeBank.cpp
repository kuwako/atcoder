#include<iostream>
#include <algorithm>
using namespace std;
int dp[100001];

int main()
{
    int N;
	cin >> N;
    dp[0] = 0;
	for(int i = 1; i <= N; i++){
		int m = dp[i-1] + 1;
		for(int k = 6; k <= i;){
            m = min(m, 1 + dp[i-k]);
            k *= 6;
        }
		for(int k = 9; k <= i;){
            m = min(m, 1 + dp[i-k]);
            k *= 9;
        }
		dp[i] = m;
	}
	cout << dp[N] << "\n";
	return 0;
}
