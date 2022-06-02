package Interview;

public class Sample {

	public static void main(String[] args) {
		int arr[] = { 23, 89, 90, 34, 15, 21, 30, 19, 45, 11, 8, 10, 9 };
		int sum = 0;
		// For loop to fetch the one by one element
		for (int i = 0; i < arr.length - 1; i++) {
			// To compare the current value to next value
			if (arr[i] < arr[i + 1]) {

				System.out.println("The smallest numbers is " + arr[i]);
				// To sum only the smallest numbers
				sum = sum + arr[i];
			}
		}
		System.out.println("The sum of the smallest numbers are " + sum);
	}
}
