#include <stdio.h>

int main(void) {

	int n;
	int cnt = 0;

	scanf_s("%d", &n);

	while (1) {
		if (n % 5 == 0) {
			cnt += n / 5;
			break;
		}
		
		n -= 3;
		cnt++;
		if (n <= 0) break;
	}

	if (n < 0) printf("-1\n");
	else printf("%d\n", cnt);

	return 0;
}