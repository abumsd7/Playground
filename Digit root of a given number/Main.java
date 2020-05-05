#include<iostream>
using namespace std;
    int fact(int n) {
        if(n < 10){
            return n;
        }
        int c = 0;
        while(n != 0) {
            c+= n % 10;
            n = n / 10;
        }
        if (c>= 10) {
            return fact(c);
        }
        return c;
    }
int main()
{
  int n,m;
  //cout<<"Enter the value of a\nEnter the value of n\n";
  cin>>n;
  cout<<fact(n);
  //Type your code here.
}