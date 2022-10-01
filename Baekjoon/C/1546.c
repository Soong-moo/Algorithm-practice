#include <stdio.h>

int main(void) {

	int i, n;
	scanf("%d", &n);

	double avg = 0.0;
	int sub;
	int max = 0;

	for (i = 0; i < n; i++) {
		scanf("%d", &sub);
		if (sub > max) { max = sub; }
		avg += sub;

	}

	avg /= n;

	double fake = (avg / max) * 100.0;

	printf("%lf", fake);

	return 0;
}