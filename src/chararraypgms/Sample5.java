package chararraypgms;

public class Sample5 {
	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c', 'd', 'e' };

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				System.out.println(arr[i]);
			}
		}
	}
}
