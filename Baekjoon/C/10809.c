#include <stdio.h>
#include <string.h>

int main(void) {

	char str[101];
	int alpha[26];
	int i, j;
	int cnt = 97;
	int r;

	scanf_s("%s", str, 100);
	
	for (i = 0; i < 26; i++) {
		alpha[i] = 100;
	}

	for (j = 0; j < strlen(str); j++) {
		r = str[j] - 'a';
		if (alpha[r] > j) {
			alpha[r] = j;
		}
	}

	for (i = 0; i < 26; i++) {
		if (alpha[i] == 100) printf("-1 ");
		else printf("%d ", alpha[i]);
	}

	printf("\n");

	return 0;
}