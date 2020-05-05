#include<iostream>
using namespace std;
int fact(int n1, int n2) {
    if (n2 != 0)
        return fact(n2, n1 % n2);
    else
        return n1;
}
int main()
{
  int n,m;
  //cout<<"Enter the value of a\nEnter the value of n\n";
  cin>>n>>m;
  cout<<"G.C.D of "<<n<<" and "<<m<<" = "<<fact(n,m);
  //Type your code here.
}