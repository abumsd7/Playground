#include<stdio.h>
struct Distance {
    int feet;
    float inch;
} d1, d2, sumOfDistances;

int main() {
    scanf("%d", &d1.feet);
    scanf("%f", &d1.inch);
    scanf("%d", &d2.feet);
    scanf("%f", &d2.inch);

    sumOfDistances.feet=d1.feet+d2.feet;
    sumOfDistances.inch=d1.inch+d2.inch;
   
    // If inch is greater than 12, changing it to feet.
    if (sumOfDistances.inch>12.0) {
        sumOfDistances.inch = sumOfDistances.inch-12.0;
        ++sumOfDistances.feet;
    }
  	if(sumOfDistances.inch- float(int(sumOfDistances.inch))==0)
    printf("%d\'-%d\"", sumOfDistances.feet, int(sumOfDistances.inch));
  	else
    printf("%d\'-%.1f\"", sumOfDistances.feet, sumOfDistances.inch);

    return 0;
}