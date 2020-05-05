#include <iostream>
using namespace std;
int main(){
  int i = 1,n,k;
  cin>>n;
  k=5;
  for(i=0;i<n;i++)
  {
    cout<<(float)k/10<<" ";
    k*=3;
  }
}