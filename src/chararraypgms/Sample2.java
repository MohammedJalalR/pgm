package chararraypgms;

public class Sample2 {
	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c', 'd', 'e' };

		for (int i = arr.length - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
