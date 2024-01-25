#include <stdio.h>

int count = 0;

// 재귀
void find(int size, int r, int c);

int main() {
    int N, r, c;
    scanf("%d %d %d", &N, &r, &c);

    // N 행렬을 받아 온다
    int size = 1 << N; // 한 변의 사이즈

    find(size, r, c);

    printf("%d\n", count);

    return 0;
}

// 몇 사분면에 포함이 되어있는지 체크를 하면 된다.
void find(int size, int r, int c) {
    // size 가 1이 되면 재귀 반복을 멈춘다.
    if (size == 1)
        return;

    // r과 c 가 아무 곳에도 들어가지 않았음으로 r, c 를 그대로 받는다.
    // 사용자의 위치를 그냥 넘겨준다.
    if (r < size / 2 && c < size / 2) {
        find(size / 2, r, c);
    }
    // 카운트에 1사분면의 값을 더해주고 카운트 값을 더해준다.
    // 사이즈 크기를 반으로 줄이고 열은 1사 분면의 사이즈 만큼 빼준다.
    else if (r < size / 2 && c >= size / 2) {
        count += size * size / 4;
        find(size / 2, r, c - size / 2);
    }
    // 12 방문 후 값을 넘겨준다.
    // 열을 줄인다.
    else if (r >= size / 2 && c < size / 2) {
        count += (size * size / 4) * 2;
        find(size / 2, r - size / 2, c);
    }
    // 1,2,3 사분면의 값을 더하고
    // 1,3 에서 줄어드는 행열 값을 빼 준다.
    else {
        count += (size * size / 4) * 3;
        find(size / 2, r - size / 2, c - size / 2);
    }
}
