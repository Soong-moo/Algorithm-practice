#include <stdio.h>

int main(void) {

	int a, sum = 0;
	scanf_s("%d", &a);

	char arr[a];

	scanf_s("%s", &arr);

	for (int i = 0; i < a; i++) {
		sum += arr[i] - '0';
	}

	printf("%d", sum);

	return 0;
}	