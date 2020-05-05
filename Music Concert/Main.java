#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n;
  cin>>n;
  int *a=(int*)malloc(n*sizeof(int));
  int i;
  for(i=0;i<n;i++)
  {	int no;
   cin>>no;
    *(a+i)=no;
  }
  int od=0,ev=0;
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)ev++;
    else od++;
  }
  cout<<od<<endl;
  cout<<ev;
  return 0;
}