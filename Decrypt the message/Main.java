#include<iostream> 
using namespace std;
int main(){
	long long int sum = 1; 
   int n1,n2;//all divisors and add them 
  cin>>n1>>n2;
  int n=n1+n2;
    for (int i=2; i*i<=n; i++) 
    { 
        if (n%i==0) 
        { 
            if(i*i!=n) 
                sum = sum + i + n/i; 
            else
                sum=sum+i; 
        } 
    }  
     // If sum of divisors is equal to 
     // n, then n is a perfect number 
     if (sum == n && n != 1) 
          cout<<"They can read the message";
  	else cout<<"They can't read the message";
}