#include<cstdio>
int main()
{
    int a; scanf("%d", &a);
    int b; scanf("%d", &b);
    int n; scanf("%d", &n);
    char x[100001]; scanf("%s", x);

    for (int i=0; i<n; i++) {
        if (x[i] == 'S') {
            a--;
        } else if (x[i] == 'C') {
            b--;
        } else if (a >= b){
            a--;
        } else {
            b--;
        }
    }
    if (a < 0) a = 0;
    if (b < 0) b = 0;

    printf("%d\n", a);
    printf("%d\n", b);
    return 0;
}
