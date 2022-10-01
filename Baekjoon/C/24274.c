#include <stdio.h>

int main(void) {

	int t; // 何前 包府 冉荐
	int n; // 何前 俺荐
	int a, b; //农扁 力茄, 公霸 力茄
	int u, v; //何前 农扁, 何前 公霸
	
	scanf_s("%d", &t);

	for (int i = 0; i < t; i++) {
		scanf_s("%d", &n);
		scanf_s("%d %d", &a, &b);
		for (int j = 0; j < n; j++) {
			scanf_s("%d %d", &u, &v);
		}
		printf("Material Management %d\n", i + 1);
		printf("Classification ---- End!\n");
	}

	return 0;
}