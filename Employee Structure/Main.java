#include<iostream>
using namespace std;
struct student {
    char firstName[50];
    char dept[50];
  	int year;
  	int id;
    int marks;
} s[100];

int main() {
    int i;
	int n;
  	//cin>>n;
    // storing information
    for (i = 0; i < 1; ++i) {
        printf("Enter name:\n");
        scanf("%s", s[i].firstName);
      	printf("Enter ID:\n");
      	scanf("%d",&s[i].id);
        printf("Enter age:\n");
      	scanf("%d",&s[i].year);
      	printf("Enter designation:\n");
        scanf("%s", s[i].dept);
      	printf("Enter Salary:\n");
        scanf("%d", &s[i].marks);
    }
    printf("Employee Details\n");

    // displaying information
    for (i = 0; i <1; ++i) {
      	printf("Name of the Employee : ");
        printf("%s\n", s[i].firstName);
      	printf("ID of the Employee : ");
      	printf("%d\n",s[i].id);
        printf("Age of the Employee : ");
      	printf("%d\n",s[i].year);
      	printf("Designation of the Employee : ");
        printf("%s\n", s[i].dept);
      	printf("Salary of the Employee : ");
        printf("%d\n", s[i].marks);
    }
    return 0;
}