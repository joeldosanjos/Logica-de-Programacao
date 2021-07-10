#include <stdio.h>
int main()
{
    int code[13];
    int lastNumber, i, rounded;
    float sum=0;

    printf("Barcode (one number at a time): ");
    for (i=0;i<=12;i++) {
        scanf("%d", &code[i]);
    }
    lastNumber = code[12];
    for (i=0;i<=11;i++) {
        code[i] = code[i] * 1;
        sum = sum + code[i];
        i++;
        code[i] = code[i] * 3;
        sum = sum + code[i];
    }

    rounded = sum / 10;
    rounded = ((rounded + 1) * 10) - sum;

    if(rounded == lastNumber) {
        printf("Ok.");
    } else {
        printf("\nRefused.");
    }

    return(0);
}
