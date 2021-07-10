#include <string.h>
void func2(float total[], char name[][60], int n)
{
    int i, j, temporary;
    char temporarychar[60];

    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(total[i] > total[j])
            {
                temporary = total[i];
                total[i] = total[j];
                total[j] = temporary;

                strcpy(temporarychar, name[i]);
                strcpy(name[i], name[j]);
                strcpy(name[j], temporarychar);
            }
        }
    }
}
