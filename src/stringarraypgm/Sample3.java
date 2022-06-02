package stringarraypgm;

public class Sample3 {
	public static void main(String[] args) {
		String[] arr = { "apple", "ball", "cat", "Dog" };
		for (int i = arr.length - 1; i >= 0; i--) {
			if (i % 2 == 1) {
				System.out.println(arr[i]);
			}
		}

	}

}
