/* C++ Program to find the maximum element in each row of a matrix */
#include<iostream>

using namespace std;
void display(int result[], int n)
{
    int i;
    for(i = 0; i < n; i++)
    {
        cout << result[i] <<endl;
    }
}

int main()
{
    int i, j,m,n;
  	cin>>m>>n;
    int mat[m][n];
    for(i = 0; i < m; i++)
    {
        for(j = 0; j < n; j++)
            cin >> mat[i][j];
    }
	i = 0, j;
    int max = 0;
    int result[m];
    while (i < m)
    {
        for ( j = 0; j < n; j++)
        {
            if (mat[i][j] > max)
            {
                max = mat[i][j];
            }
        }
        result[i] = max;
        max = 0;
        i++;

    }
    display(result, m);
    return 0;
}