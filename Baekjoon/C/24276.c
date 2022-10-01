#include <stdio.h>

int main(void) {

	double x1, x2, x3, y1, y2, y3;

	const double pi = 3.141592;
	x1 = 1;
	x2 = 2;
	x3 = 3;
	y1 = 6;
	y2 = 4;
	y3 = 5;

	//y축 회전
	double yresult = ((x3 - x1) * (x3 - x1) * pi * (y2 - y1) / 3);
	//x축 회전
	double xresult = ((y2 - y1) * (y2 - y1) * pi * (x3 - x1) / 3);

	printf("%.9lf ", xresult);
	printf("%.9lf\n", yresult);


	return 0;
}