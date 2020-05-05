#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string a;
  int b;
  cin>>a>>b;
  if(a=="front")
  {
    (b==1)?cout<<"Left ":cout<<"Right ";
  }
  if(a=="rear")
  {
        (b==1)?cout<<"Right ":cout<<"Left ";
  }
  cout<<"Handed";

}