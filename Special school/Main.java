#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str,str2;
  getline(cin,str);
  getline(cin,str2);
  int i=0,l= str.size() - 1,flag=0;
  while(str[i]!='\0')
  {
    if(str[i]!=str2[l])
    {
      cout<<"It is wrong";
      flag=1;
      break;
    }
    i++;
    l--;
  }
  if(flag==0)
    cout<<"It is correct";
   
}