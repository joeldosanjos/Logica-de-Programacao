#include <stdio.h>
#include<string.h>
int main()
{
    int availableSpaces, car=0, i, barrier, totalEntry=0, time[500], timeExit, payment;
    char carPlate[500][9], searchCarPlate[9];
    int calculation(int time, int timeExit);

    printf("Available parking spaces: ");
    scanf("%d", &availableSpaces);

    while(car<=availableSpaces)
    {
        printf("\nEntry or exit?\n");
        printf("1 - Entry\n");
        printf("2 - Exit\n");
        printf("3 - Exit Program\n");
        scanf("%d", &barrier);

        if (barrier == 1)
        {
            car++;
            totalEntry++;
            printf("\nVehicle license plate: ");
            scanf("%s", &carPlate[totalEntry]);
            printf("\nTime of entry (hour only): ");
            scanf("%d:00",&time[totalEntry]);
        }
        else if (barrier == 2)
        {
            car--;
            printf("\nTime of exit (hour only): ");
            scanf("%d:00",&timeExit);
            printf("\nVehicle license plate: ");
            scanf("%s", &searchCarPlate);
            for (i=1;i<500;i++)
            {
                if(strcmp (searchCarPlate, carPlate[i]) == 0)
                {
                    payment = calculation(time[i], timeExit);
                    printf("\nLicense plate: %s\n", carPlate[i]);
                    printf("Time of entry: %d:00\n", time[i]);
                    printf("Time of exit: %d:00\n", timeExit);
                    printf("Total price: R$ %d,00\n", payment);
                }
            }
        }
        else if (barrier == 3)
        {
            printf("\nTotal vehicle entries = %d", totalEntry);
            return(0);
        }
        else
        {
            printf("\nInvalid operation.\n");
        }
    }
}

int calculation(int time, int timeExit)
{
    return timeExit - time;
}
