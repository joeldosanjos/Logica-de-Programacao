#include<stdio.h>
#include<locale.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");
    int i, ip[4], option, a[10], x;
    char type;

        for(i=0; i<4; i++)
        {
            printf("Insert the %dº two IP numbers..: ", i+1);
            scanf("%d", &ip[i]);
        }

        do
        {
            printf("                    __________                    \n");
            printf("                   |                              |                   \n");
            printf("                   |    :::: IP Adress ::::       |                   \n");
            printf("                   |    1 - Show Class            |                   \n");
            printf("                   |    2 - Show Binary           |                   \n");
            printf("                   |    3 - Insert another IP     |                   \n");
            printf("                   |    0 - Leave                 |                   \n");
            printf("                   |__________|                   \n\n");
            printf("  Choose an option..: ");
            scanf("%i",&option);

            switch(option)
        {
            case 0:
                return(0);
            break;

            case 1:
                type = classe(ip[0]);
                if(type == NULL) {
                    printf("\nInvalid IP.\n");
                } else {
                printf("  Class %c\n", type);
                }
            break;

            case 2:
                printf("  Binary: ");
                for(x=0;x<4;x++){
                for(i=0;ip[x]>0;i++)
                {
                    a[i]=ip[x]%2;
                    ip[x]=ip[x]/2;
                }
                for(i=i-1;i>=0;i--)
                {
                    printf("%d",a[i]);
                }
            }

            break;

            case 3:
                printf("\n");
                for(i=0; i<4; i++)
                {
                    printf("Insert the %dº two IP numbers..: ", i+1);
                    scanf("%d", &ip[i]);
                }
            break;

            default:
                printf("\nInvalid operation. Type another option.\n");
        }
        }while(option>0 || option<4);

    return(0);
}

int classe(int a)
{
    char type;
    if(a>=0 && a<=127)
    {
        type='A';
    }
    if(a>=128 && a<=191)
    {
        type='B';
    }
    if(a>=192 && a<=223)
    {
        type='C';
    }
    if(a>=224 && a<=239)
    {
        type='D';
    }
    if(a>=240 && a<=255)
    {
        type='E';
    }

    return type;
}
