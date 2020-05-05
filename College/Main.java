#include<iostream>
#include <iomanip>      // std::setprecision


using namespace std;
struct student {
    char firstName[50];
    char dept[50];
  	int year;
  	int id;
    float marks;
} s[100];

int main() {
    int i;
	int n;
	printf("Enter the number of colleges\n");
  	cin>>n;
    // storing information
    for (i = 0; i < n; ++i) {
        printf("Enter the details of college %d\n",i+1);
      	printf("Enter name\n");
        scanf("%s", s[i].firstName);
      	printf("Enter city\n");
        scanf("%s", s[i].dept);
        printf("Enter year of establishment\n");
      	scanf("%d",&s[i].year);
      	printf("Enter pass percentage\n");
        scanf("%f", &s[i].marks);
    }
    printf("Details of colleges\n");

    // displaying information
    for (i = 0; i < n; ++i) {
      	printf("College:%d\n",i+1);
      	printf("Name:");
        printf("%s\n", s[i].firstName);
        printf("City:");
        printf("%s\n", s[i].dept);
        printf("Year of establishment:");
      	printf("%d\n",s[i].year);
      	printf("Pass percentage:");
        cout<<std::setprecision(5)<<s[i].marks<<"\n";
    }
    return 0;
}