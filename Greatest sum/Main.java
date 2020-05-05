#include<iostream>
using namespace std;
int main()
{
  	int mat[10][10],sr[10],sc[10],a,b,c,i,j;
  	cin>>a>>b;
  	for( i=0;i<a;i++)
    {   c=0;
      	for( j=0;j<b;j++)
    	{ 	int ma;
         	cin>>ma;
         	c+=ma;
      		mat[i][j]=ma;
        }
     	sr[i]=c;
    }
    for( i=0;i<b;i++)
    {   c=0;
      	for( j=0;j<a;j++)
    	{ 
         	c+=mat[j][i];
        }
     	sc[i]=c;
    }
  	int mxri=0,mxrc=0,mr=0,mc=0;
  cout<<"Sum of rows is "; 
  	for(i=0;i<a;i++)
    { cout<<sr[i]<<" "; 
      if(sr[i]>mr)
      { mr=sr[i];
       	mxri=i;
      }
    }
  cout<<"\nRow "<<mxri+1<<" has maximum sum\n";
      cout<<"Sum of columns is "; 
   for(i=0;i<b;i++)
   { cout<<sc[i]<<" ";  
     if(sc[i]>mc)
      { mc=sc[i];
       	mxrc=i;
      }
   }
    cout<<"\nColumn "<<mxrc+1<<" has maximum sum\n";

  
  	
}