#include<iostream>
using namespace std;
int fact(int n) {
    if (n==0) return 0;
  	else if (n==1)
        return 1;
    else
        return fact(n-1)+fact(n-2);
}
int main()
{
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fact(n-1);
  //Type your code here.
}