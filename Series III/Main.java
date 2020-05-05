#include<iostream>
using namespace std;
int main(){
	int i = 1,k=6,n,m=5;
  	cin>>n;
	for(i=0;i<n;i++)
    {
      cout<<k<<" ";
      k=k+m;
      m+=5;
    }
	return 0;
}