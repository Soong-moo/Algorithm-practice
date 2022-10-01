#include <stdio.h>
#include <math.h>

int main(void) {

	int n;
	int cnt = 2;
	int result;
	scanf_s("%d", &n);

	for (int i = 0; i < n; i++) {
		result = pow(cnt, n);
	}
	printf("%d\n", result);
	
	return 0;
}