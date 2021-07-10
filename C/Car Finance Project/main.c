#include <stdio.h>
#include <stdlib.h>
#include "func1.h"

int main()
{
    int i, x, selln, installment, interest;
    float value, totalcalculation, total[4];
    char model[20], name[4][60];

    for(i=0;i<4;i++)
    {
        totalcalculation = 0;
        printf("\nName: ");
        fflush(stdin);
        gets(name[i]);
        printf("Number of sales: ");
        scanf("%d", &selln);

        for(x=0;x<selln;x++)
        {
            printf("\n--------------- Sale %d ---------------\n", x+1);
            printf("Model: ");
            fflush(stdin);
            gets(model);
            printf("Amount to be financed: ");
            scanf("%f", &value);
            printf("Number of installments: ");
            scanf("%d", &installment);
            printf("Interest rate: ");
            scanf("%d", &interest);
            value = func1(value, installment, interest);
            totalcalculation = totalcalculation + value;
        }
        total[i] = totalcalculation;
    }

    printf("\n---------- Result ----------\n");
    func2(total, name, 4);
    for(i=3;i>=0;i--){
        printf("Seller's name: %s\n", name[i]);
        printf("Sales results: %.2f\n", total[i]);
        printf("-------------------------------\n");
    }

    return(0);
}
