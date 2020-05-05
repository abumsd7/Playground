#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,n,r,i;
  cin>>p>>n>>r;
  i=(p*n*r)/100;
  float a= (i*2)/100.0f;
  cout<<i<<"\n";
  cout<<i+p<<"\n";
  cout<<a<<"\n";
  cout<<(i+p)-a;
}