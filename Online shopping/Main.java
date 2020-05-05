#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int f1,f2,f3,s1,s2,s3,a1,a2,a3;
  cin>>f1>>f2>>f3>>s1>>s2>>s3>>a1>>a2>>a3;
  int rf,rs,ra;
  rf=(f1-(f1*(f2/100.0)))+f3;
  rs=(s1-(s1*(s2/100.0)))+s3;
  ra=(a1-(a1*(a2/100.0)))+a3;
  cout<<"In Flipkart Rs."<<rf<<endl;
cout<<"In Snapdeal Rs."<<rs<<endl;
cout<<"In Amazon Rs."<<ra<<endl;
  cout<<"He will prefer ";
  if(rf<=rs && rf<=ra)cout<<"Flipkart";
  else if(rs<rf &&rs<ra)cout<<"Snapdeal";
  else cout<<"Amazon";
}
