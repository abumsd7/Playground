#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  float e=a/6.0f;
  float f,g,h;
  f=b/e;
  g=((d/6)+((d%6)/10.0f));
  h=c/g;
  cout<<(int)e<<endl;
  cout<<g<<endl;
	printf("%.1f\n",h);
  printf("%.1f\n",f);
  if(h>f)cout<<"Eligible to Win";
  else cout<<"Not Eligible to Win";
  
  
}