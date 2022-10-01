#include <stdio.h>
#include <string.h>

int main(void) {

	int i, j, n;
	int sum = 0;
	int cnt = 1;
	char arr[80];

	scanf("%d", &n);

	for (i = 0; i < n; i++) {

		sum = 0; cnt = 1;
		scanf("%s", arr);

		for (j = 0; j < strlen(arr); j++) { //strlen == 문자열 길이 측정

			if (arr[j] == 'O') {
				sum += cnt;
				cnt++;
			}
			else {
				cnt = 1;
			}
		}
		printf("%d\n", sum);
	}


	return 0;
}