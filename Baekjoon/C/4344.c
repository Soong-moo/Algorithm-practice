#include <stdio.h>

int main(void) {

	int c = 0; //���̽� ��
	int n = 0; //�л� ��
	int total = 0; // �հ�
	int cnt = 0; // �ʰ� ī��Ʈ
	double avg = 0.0; //���
	int score[1001] = { 0, };

	scanf("%d", &c);

	for (int i = 0; i < c; i++) {

		total = 0; //�ʱ�ȭ
		cnt = 0;

		scanf("%d", &n);

		for (int j = 0; j < n; j++) {

			scanf("%d", &score[j]); //���� ����
			total += score[j];
		}

		avg = (double)total / n;

		for (int k = 0; k < n; k++) {
			if (avg < score[k]) { //�ʰ� Ȯ��
				cnt++;
			}
		}

		printf("%.3lf%%\n", ((double)cnt * 100 / n)); //���� ���
	}

	return 0;
}