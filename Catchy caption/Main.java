#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
  string str;
  getline(cin,str);
  if(str.size()>50)
    cout<<"Caption not eligible for the contest";
  else
    cout<<"Caption eligible for the contest";

   
}