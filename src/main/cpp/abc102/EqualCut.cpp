#include<cstdio>
#include<algorithm>
using namespace std;
long long v[200005],k[200005];
// https://beta.atcoder.jp/contests/abc102/submissions/2780996

int main() {
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        scanf("%lld",&v[i]);
        k[i]=k[i-1]+v[i];
    }
    long long p[5]={0,0,0,0,0},mmin=0x7fffffff;
    int l=1,r=3;
    for(int i=2;i<n-1;i++){
        while (
            l<i
            && abs(k[l]-k[0]-(k[i]-k[l]))
                >= abs(k[l+1]-k[0]-(k[i]-k[l+1]))
        ) {
            l++;
        }
        while (
            r<n
            && abs(k[r]-k[i]-(k[n]-k[r]))
                >= abs(k[r+1]-k[i]-(k[n]-k[r+1]))) {
            r++;
        }
        p[1]=k[l]-k[0];
        p[2]=k[i]-k[l];
        p[3]=k[r]-k[i];
        p[4]=k[n]-k[r];
        mmin=min(mmin,max(p[1],max(p[2], max(p[3],p[4])))-min(p[1], min(p[2], min(p[3], p[4]))));
    }
    printf("%lld\n",mmin);
    return 0;
}
