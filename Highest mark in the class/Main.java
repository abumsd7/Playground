#include<iostream>
using namespace std;
int main()
{
  // Type your code here
      int i,arr[10]; 
  	int n;
  cin>>n;
  for(i=0;i<n;i++)
    cin>>arr[i];
      
    // Initialize maximum element 
    int max = arr[0]; 
  
    // Traverse array elements  
    // from second and compare 
    // every element with current max  
    for (i = 1; i < n; i++) 
        if (arr[i] > max) 
            max = arr[i];
  cout<<max;
}