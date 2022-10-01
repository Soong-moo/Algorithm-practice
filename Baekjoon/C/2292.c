#include <stdio.h>

int main(void) {


	int x, cnt = 1;

	scanf_s("%d", &x);

	while (x > 1) {
		x = x - (6 * cnt);
		cnt++;
	}

	printf("%d", cnt);

	return 0;
}