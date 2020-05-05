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
    int max,flag=0;
    cin>>max; 
    for (i = 1; i < n; i++) 
        if (arr[i] == max) 
        {    cout<<"She passed her exam";
  				flag=1;
        }
 	if(flag==0)cout<<"She failed";
  	
}