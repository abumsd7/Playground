#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c=0;
  cin>>n;
  while(n!=1)
  {
    cout<<n<<endl;
    if(n%2==0) n/=2;
    else n=(3*n)+1;
    c++;
  }
  cout<<"1"<<endl;
  cout<<c;
}