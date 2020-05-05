// C++ program to find the maximum 
// element of each column. 
#include <bits/stdc++.h> 
using namespace std; 
const int MAX = 100; 
void largestInColumn(int mat[][MAX], int rows, int cols) 
{ 
    for (int i = 0; i < cols; i++) { 
        int maxm = mat[0][i]; 
        for (int j = 1; j < rows; j++) { 
            if (mat[j][i] > maxm) 
                maxm = mat[j][i]; 
        } 
  
        // print the largest element of the column 
        cout << maxm << endl; 
    } 
} 
  
// Driver code 
int main() 
{ 
    int n,m; 
	int mat[100][100];
  	cin>>m>>n;
  	for(int i=0;i<m;i++)
      for(int j=0;j<n;j++)
        cin>>mat[i][j];
    largestInColumn(mat, m, n); 
  
    return 0; 
}