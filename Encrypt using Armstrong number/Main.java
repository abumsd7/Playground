#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int sum=0,co,no=n;
  int su=3;
  if(n/100>10)su=4;
  while(no!=0)
  {	co=no%10;
   	sum+=power(co,su);
   	no/=10;
  }
  if(n==sum)return 1;
  return 0;
    
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}