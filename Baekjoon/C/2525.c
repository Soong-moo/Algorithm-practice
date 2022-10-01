#include <stdio.h>

int main(void) {

	int hour;
	int minute;
	int plus;

	scanf_s("%d %d", &hour, &minute);
	scanf_s("%d", &plus);

	int result = minute + plus;

	if (result >= 60) {
		hour += result / 60;
		minute = result % 60;
		if (hour >= 24) {
			hour = hour % 24;
		}
	}
	else {
		hour += result / 60;
		minute += plus;
		if (hour >= 24) {
			hour = hour % 24;
		}
	}

	printf("%d %d\n", hour, minute);

	return 0;
}