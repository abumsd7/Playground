#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int d= int(pow(a,b));
  if(d>=c) cout<<"Doctor, you can proceed with your experiment.";
  else cout<<"Sorry Doctor! You need more bacteria.";
}
  