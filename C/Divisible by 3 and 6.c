#include <stdio.h>

int main() {
    int value;

    printf("Insert any value: ");
    scanf("%d", &value);

    if(((value % 3) == 0) && ((value % 5) == 0)) {
        printf("Value divisible by 3 and 5");
    }
    else {
        printf("Value not divisible by 3 e 5");
    }

    return(0);
}
