#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,t;
  cin>>r>>c>>t;
  int r1,c1,cl;
  cl=(r*c)-(r-1);
  if((t>=1 && t<=r) || (t%r==1) || (t>=cl && t<=r*c))
    cout<<"Yes";
  else cout<<"No";
}