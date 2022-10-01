#include <stdio.h>

int main(void) {

	int arr[10];
	int cnt = 10;

	for (int i = 0; i < 10; i++) {
		scanf("%d", &arr[i]);

		for (int j = 0; j < i; j++) {
			if (arr[j] % 42 == arr[i] % 42) { cnt -= 1; break; }
		}
	}

	printf("%d", cnt);

	return 0;
}