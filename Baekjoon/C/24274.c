#include <stdio.h>

int main(void) {

	int t; // ��ǰ ���� Ƚ��
	int n; // ��ǰ ����
	int a, b; //ũ�� ����, ���� ����
	int u, v; //��ǰ ũ��, ��ǰ ����
	
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