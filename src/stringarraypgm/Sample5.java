package stringarraypgm;

public class Sample5 {
	public static void main(String[] args) {

		String[] arr = { "apple", "ball", "cat", "Dog" };
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				System.out.println(arr[i]);
			}
		}
	}

}
