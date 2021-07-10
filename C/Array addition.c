#include <stdio.h>

int main()
{
    int array[10], sum=0;
    int c;

    for(c=0;c<=9;c++) {
        printf("Number: ");
        scanf("%d",&array[c]);
        sum = array[c] + sum;
    }
    printf("Sum: %d", sum);
}
