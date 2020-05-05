#include <iostream>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
 struct student p1;
 scanf("%[^\n]",p1.name);
 std::cin>>p1.roll>>p1.marks; 
 std::cout<<"\nStudent Details\n"<<"Name: "<< p1.name<<"\nRoll: "<< p1.roll<<"\nMarks: "<< p1.marks; 
}