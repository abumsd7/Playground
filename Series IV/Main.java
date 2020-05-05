#include<iostream>
using namespace std;
int main(){
	int i = 1,k=1,n,m=5;
  	cin>>n;
	for(i=0;i<n;i++)
    {
      if(i%2==0) cout<<(k*k)-1<<" ";
		else cout<<(k*k)-2<<" ";
      k++;
    }
	return 0;
}