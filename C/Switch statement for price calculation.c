#include <stdio.h>
int main()
{
float price;
int type;

printf("Type the price tag: ");
scanf("%f", &price);
printf("\nSelect the payment method type:\n");
printf("1 for cash or cash checks.\n");
printf("2 for cash credit card.\n");
printf("3 for two installments.\n");
printf("4 for three installments.\n");
printf("\nCommand: ");
scanf("%d", &type);

switch(type) {
    case 1:
    price = price - (price * 0.1);
    printf("\nThe price to be paid is %.2f\n", price);
    break;

    case 2:
    price = price - (price * 0.05);
    printf("\nThe price to be paid is %.2f\n", price);
    break;

    case 3:
    printf("\nNo price modification, it will be paid %.2f\n", price);
    break;

    case 4:
    price = price + (price * 0.1);
    printf("\nThe price to be paid is %.2f\n", price);
    break;

    default:
    printf("\nCommand not found.\n");
}

return(0);
}
