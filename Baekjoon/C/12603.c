#include <stdio.h>

int main(void) {

	int n; // case Мі
	int c; // Че
	int i; // item amount
	int p[100]; // item contents
	int x, y;

	scanf_s("%d", &n); 

	for (int a = 0; a < n; a++) {
		scanf_s("%d", &c);
		scanf_s("%d", &i);

		for (int b = 0; b < i; b++) {
			scanf_s("%d", &p[b]);
		}

		for (int t = 0; t < i - 1; t++) {
			for (int k = t + 1; k < i; k++) {
				if (p[t] + p[k] == c) {
					x = t, y = k;
					printf("CASE #%d : %d %d\n", a + 1, x + 1, y + 1);
				}
			}
		}
	}
	
	return 0;
}