package quiz05;

public class Computer extends Calculator {

	
	double circle(int a) {
		double area = 0;
		area = (a*a*Math.PI);
		return area;
	}
	double rect(double a) {
		return a*a;
	}
	double rect(double a, double b) {
		return a*b;
	}
	double rect(double a, double b, double c) {
		return 2*(a*b)+2*(a*c)+2*(b*c);
	}
	
	
	
	
	
	
}
