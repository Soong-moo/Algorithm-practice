#include <stdio.h>

int main(void) {

	int i, j, n, num;
	int cnt = 0;

	scanf_s("%d", &n); //반복 횟수

	for (i = 0; i < n; i++) {
		scanf_s("%d", &num); // 수 입력
		for (j = 2; j < num; j++) {
			if (num % j == 0) break;
		}
		if (j == num) cnt++;
	}

	printf("%d", cnt);

	return 0;
}