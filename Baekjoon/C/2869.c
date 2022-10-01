#include <stdio.h>

int main(void) {

	int a, b, v;
	int day;

	scanf_s("%d %d %d", &a, &b, &v);

	day = (v - b - 1) / (a - b) + 1;
	
	printf("%d\n", day);
	return 0;
}