#include <stdio.h>

int main(void) {

	int cnt;
	int multiple;
	char str[20];
	int j = 0;

	scanf_s("%d", &cnt);


	for (int n = 0; n < cnt; n++) {

		scanf_s("%d", &multiple);
		getchar();
		scanf_s("%s", str, 20);

		for (j = 0; str[j] != '\0'; j++) {
			for (int i = 0; i < multiple; i++) {
				printf("%c", str[j]);
			}
		}
		printf("\n");
	}

	return 0;
}