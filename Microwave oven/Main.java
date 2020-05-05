#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;float b;
  cin>>a>>b;
  if(a>3)cout<<"Number of items is more";
  else if(a==3)	printf("%.2f",b*2.0);
  else if(a<3)	printf("%.2f",(b+(b*0.5)));
}