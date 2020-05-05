#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e;
  cin>>a>>b>>c;
  d=a+1;
  e=(b*(b-2))+1;
  if((c>=d && c<=a+a) || (c>=e && c<=e+4))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
  
}