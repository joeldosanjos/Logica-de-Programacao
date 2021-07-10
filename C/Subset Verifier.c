#include <stdio.h>

int main()
{
    int a[10], b[5];
    int x, y, equivalent=0;

    for(x=0;x<=9;x++) {
        printf("Array A: ");
        scanf("%d",&a[x]);
    }
    for(x=0;x<=4;x++) {
        printf("Array B: ");
        scanf("%d",&b[x]);
    }

    for(y=0;y<=4;y++) {
        for(x=0;x<=9;x++){
            if(b[y] == a[x]) {
                equivalent++;
            }
        }
    }

    if (equivalent == 5) {
        printf("B is a subset of A");
    } else if (equivalent < 5 && equivalent > 0) {
        printf("B is partially a subset of A");
    } else {
        printf("B is not a subset of A");
    }
}

