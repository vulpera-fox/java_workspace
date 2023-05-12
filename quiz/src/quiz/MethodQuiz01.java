package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class MethodQuiz01 {

	public static void main(String[] args) {

		method1();

		System.out.println(method2("안녕하세요"));

		System.out.println(method3(3,5,3.5));

		System.out.println(method4(5));

		method5("안녕", 3);

		System.out.println(maxNum(40, 30));

		System.out.println(abs(-30));

		char arr[] = {'a','b','d','c'};
		System.out.println(method6(arr));

		int arr2[] = {1,2,3,4,9};
		System.out.println(method7(arr2));

		System.out.println(Arrays.toString(method8("Hello","Bye")));

		System.out.println(java(10));
		

	}

	static void method1() {
		System.out.println("안녕");
	}
	static String method2(String s) {

		String s1 = s;

		return s1;
	}
	static double method3 (int i, int j, double k) {
		double sum = 0;

		sum = i + j + k;

		return sum;
	}
	static String method4 (int i) {
		String s = "";
		if ( i % 2 == 0) {
			s = "짝수";
		} else {
			s = "홀수";
		}
		return s;
	}
	static void method5 (String s, int i) {
		String s1 = "";
		for ( int a = 1; a <= i; a++ ) {
			s1 += s;
		}
		System.out.println(s1);
	}
	static int maxNum (int a, int b) {
		return a>b ? a : b;
	}
	static int abs ( int a ) {
		int abs = Math.abs(a);
		return abs;
	}
	static String method6 ( char[] c ) {
		String s = "";
		for ( int i = 0; i < c.length; i++ ) {
			s = s + c[i];
		}

		return s;
	}
	static int method7 ( int[] i ) {
		int sum = 0;
		for ( int j = 0; j < i.length; j++ ) {
			sum += i[j];
		}
		return sum;
	}
	static String[] method8 ( String s, String s1 ) {
		String arr3[] = {s, s1};

		return arr3;
	}
	static String java ( int a ) {
		
		String s = "";
		
		for ( int i = 1; i <= a; i++ ) {
			if ( i % 2 == 1 ) {
				s += "자";
			} else {
				s += "바";
			}
		}
		return s;
		
	}
}
