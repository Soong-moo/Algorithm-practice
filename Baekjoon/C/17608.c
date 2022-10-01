#include <stdio.h>

int main(void) {

	int n;
	int cnt = 1;
	int top;
	scanf_s("%d", &n);

	int h[n];

	for (int i = 0; i < n; i++) {
		scanf_s("%d", &h[i]);
	}

	top = h[n - 1];

	for (int i = n - 1; i >= 0; i--) {
		if (h[i] > top) {
			cnt++;
			top = h[i];
		}
	}

	printf("%d\n", cnt);

	return 0;
}