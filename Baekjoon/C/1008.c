#include <stdio.h>

int main(void) {

	int x, y;

	scanf_s("%d %d", &x, &y);

	printf("%.9f", (double)x / y);

	return 0;
}