#include <stdio.h>

int main() {
    int num, ans;
    scanf("%d", &num);
    ans = 1;

    if (num == 0) {
        printf("1\n");
    } else {
        for (int i = 1; i <= num; i++) {
            ans = ans * i;
        }
        printf("%d\n", ans);
    }

    return 0;
}
