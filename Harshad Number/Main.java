#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b=0,c;
  cin>>a;
  c=a;
  while(a!=0)
  {
    b+=a%10;
    a/=10;
  }
  (c%b==0)?cout<<"Harshad Number":cout<<"Not Harshad Number";
}