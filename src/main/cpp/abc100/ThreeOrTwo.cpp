#include<iostream>
#include <algorithm>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int ans = 0;
    for (int i = 0; i < n; ++i)
    {
        long long x;
        cin >> x;
        while (1)
        {
            if (x % 2 != 0) break;
            ans++;
            x = x / 2;
        }
    }

	cout << ans << "\n";
	return 0;
}
