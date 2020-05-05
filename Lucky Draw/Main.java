#include<iostream>
using namespace std;
int main(){
    int n, i, flag = 0;
    scanf("%d", &n);

    for (i = 2; i <= n / 2; ++i) {

        // condition for non-prime
        if (n % i == 0) {
            flag = 1;
            break;
        }
    }

    if (n == 1) {
        printf("Not eligible");
    }
    else {
        if (flag == 0)
            printf("Eligible");
        else
            printf("Not eligible");
    }
}