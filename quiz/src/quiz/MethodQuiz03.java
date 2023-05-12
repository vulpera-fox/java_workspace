package quiz;
import java.util.Arrays;
public class MethodQuiz03 {
	public static void main(String[] args) {
		char arr[] = {'a','b','d','c'};
		System.out.println(method6(arr));
		int arr2[] = {1,2,3,4,9};
		System.out.println(method7(arr2));
		System.out.println(Arrays.toString(method8("Hello","Bye")));
		System.out.println(java(10)); }
	static String method6 ( char[] c ) {
		String s = "";
		for ( int i = 0; i < c.length; i++ ) {
			s = s + c[i];}
		return s;}
	static int method7 ( int[] i ) {
		int sum = 0;
		for ( int j : i) {
			sum += j;
			}
		return sum;}
	static String[] method8 ( String s, String s1 ) {
		String arr3[] = {s, s1};
		return arr3;}
	static String java ( int a ) {
		String s = "";
		for ( int i = 1; i <= a; i++ ) {
			if ( i % 2 == 1 ) {
				s += "자";}else {
				s += "바";}}
		return s;


	}
}
