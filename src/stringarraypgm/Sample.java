package stringarraypgm;

public class Sample {

	public static void main(String[] args) {
		String[] arr = { "apple", "ball", "cat", "Dog", "ball" };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == "ball") {
				count++;
				System.out.println(arr[i]);
			}

		}
		System.out.println(count);
	}

}
