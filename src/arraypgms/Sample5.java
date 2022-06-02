package arraypgms;

public class Sample5 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		for (int i = arr.length - 1; i >= 0; i--) {
			if (i % 2 == 1) {
				System.out.println(arr[i]);
			}
		}

	}
}
