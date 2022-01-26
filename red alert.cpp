#include <iostream>;
using namespace std;
int main()
{
    int t, n, d, h;
    cin >> t;
    while (t-- > 0)
    {
        cin >> n >> d >> h;
        int ar[n];
        for (int i = 0; i < n; i++)
        {
            cin >> ar[i];
        }
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            if (ar[i] == 0)
            {
                sum -= d;
                if (sum > 0)
                    sum = 0;
            }
            else
            {
                sum += ar[i];
            }
            if (sum >= h)
            {
                cout << "YES";
                break;
            }
        }
        if (sum < h)
            cout << "NO";
    }
    return 0;
}