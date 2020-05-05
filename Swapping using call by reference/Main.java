#include<iostream>
using namespace std;
 int main()    
{    
int a,b;
cin>>a>>b;
printf("Before swapping a= %d and b=%d",a,b);      
a=a+b;//a=30 (10+20)    
b=a-b;//b=10 (30-20)    
a=a-b;//a=20 (30-10)    
printf("\nAfter swapping a= %d and b=%d",a,b);    
return 0;  
}   