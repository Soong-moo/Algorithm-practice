#include <stdio.h>

int main(void) {

	int c = 0; //케이스 수
	int n = 0; //학생 수
	int total = 0; // 합계
	int cnt = 0; // 초과 카운트
	double avg = 0.0; //평균
	int score[1001] = { 0, };

	scanf("%d", &c);

	for (int i = 0; i < c; i++) {

		total = 0; //초기화
		cnt = 0;

		scanf("%d", &n);

		for (int j = 0; j < n; j++) {

			scanf("%d", &score[j]); //시험 점수
			total += score[j];
		}

		avg = (double)total / n;

		for (int k = 0; k < n; k++) {
			if (avg < score[k]) { //초과 확인
				cnt++;
			}
		}

		printf("%.3lf%%\n", ((double)cnt * 100 / n)); //비율 출력
	}

	return 0;
}