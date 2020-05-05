#include<iostream>
using namespace std;
int main()
{
  	int mat[10][10],a,b,c,i,j;
  	cin>>a>>b;
  	for( i=0;i<a;i++)
    {   c=0;
      	for( j=0;j<b;j++)
    	{ 	int ma;
         	cin>>ma;
         	c+=ma;
      		mat[i][j]=ma;
        }
     	cout<<c<<endl;
    }
	  	
}