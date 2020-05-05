#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,o=0,e=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    int a;
    cin>>a;
    if(a%2==0)
      e+=a;
    else
      o+=a;
  }
  cout<<"The sum of the even numbers in the array is "<<e<<endl;
  cout<<"The sum of the odd numbers in the array is "<<o;
}