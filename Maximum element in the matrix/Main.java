#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,i,j,max=0;
  cin>>a>>b;
  for(i=0;i<a*b;i++)
  {
    int d;
    cin>>d;
    if(d>max)
      max=d;
  }
  cout<<"The maximum element is "<<max;
}