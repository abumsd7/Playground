#include<iostream>
#include <bits/stdc++.h> 
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,i,arr[3];
  for(i=0;i<3;i++)
    cin>>arr[i];
  sort(arr, arr+3, greater<int>());
  cout<<"The treasure is in box which has number "<<arr[1]<<endl;
  for(i=10;i>=1;i--)
  {
    if(arr[0]%i==0 && arr[1]%i==0 && arr[2]%i==0)
    {  cout<<"The code to open the box is "<<i;
    	break;
    }
  }
}