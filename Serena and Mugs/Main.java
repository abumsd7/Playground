#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,i;
  cin>>n>>m;
  int a=0;
  for(i=0;i<n;i++)
  {  int c;
    cin>>c;
  	a+=c;
  }
  printf((a<=m)?"YES":"NO");
}