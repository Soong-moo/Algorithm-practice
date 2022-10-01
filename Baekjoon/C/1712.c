#include <stdio.h>

int main(void) {

	int a; // 고정 비용
	int b; // 가변 비용
	int c; // 가격

	scanf_s("%d%d%d", &a, &b, &c);

	if (b >= c) {
		printf("-1\n");
	}
	else {
		printf("%d\n", a/(c-b)+1);
	}
	return 0;
}