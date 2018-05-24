#include<cstdio>
#include<algorithm>
using namespace std;
int n,m,f[1000][1000];
int main(){
	scanf("%d", &m); n=2;
	for(int i = 1; i <= n; i++) {
		for (int j = 1; j <= m; j++) {
			int x;
			scanf("%d", &x);
			f[i][j] = max(f[i-1][j], f[i][j-1]) + x;
		}
	}
	printf("%d\n", f[n][m]);
}
