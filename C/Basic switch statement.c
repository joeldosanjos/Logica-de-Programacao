#include <stdio.h>
int main()
{
int number;
printf("Type a number: ");
scanf("%d", &number);

switch(number)
{
    case 9:
    number = number + 1;
    printf("\n\nThe number equals to 9. %d", number);
    break;
    case 10:
    printf("\n\nThe number equals to 10.\n");
    break;
    case 11:
    printf("\n\nThe number equals to 11.\n");
    break;
    default:
    printf("\n\nThe number is neither 9, nor 10, nor 11.\n");
}

return(0);
}
