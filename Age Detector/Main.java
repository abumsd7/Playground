#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  if(b==0)b+=100;
  if(a>b)cout<<(b+100)-a;
  else cout<<(b-a);
}