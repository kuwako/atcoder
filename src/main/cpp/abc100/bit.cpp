#include<iostream>
#include<vector>
#include <algorithm>
using namespace std;

int main()
{
    // scanf("%lld %lld", &n, &m);
    int i = 10;
    printf("%d\n", i);
    for (int j = 0; j < 100; ++j)
    {
        printf("%d: %d %d\n", j, i << j, i & j);
    }
}
