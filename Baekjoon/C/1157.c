#include <stdio.h>
#include <string.h>

int main(void) {

	char arr[1000001];
	scanf_s("%s", arr, 1000001);
	int alpha[26] = { 0, };
	int cnt = 97;
	int equal = 0;
	int max = 0;
	int m1, m2 = -1;
	int len = strlen(arr);


	for (int i = 0; i < len; i++) {

		if (65 <= arr[i] && arr[i] <= 90) {
			arr[i] += 32;
		}

		alpha[arr[i] - 97]++;

	}

	for (int i = 0; i < 26; i++) {

		if (alpha[i] > max) {
			max = alpha[i];
			m1 = i;
		}

		else if (alpha[i] == max) {
			m1 = i;
			m2 = i;
		}

	}

	if (m1 == m2) {
		printf("?\n");
	}

	else {
		printf("%c\n", (char)(m1 + 65));
	}
	return 0;
}