#include<iostream>
using namespace std;
int fact(int n,int m) {
    if (m==0) return 1;
  	if (m==1)
        return n;
    return n*fact(n,m-1);
}
int main()
{
  int n,m;
  cout<<"Enter the value of a\nEnter the value of n\n";
  cin>>n>>m;
  cout<<"The value of "<<n<<" power "<<m<<" is "<<fact(n,m);
  //Type your code here.
}