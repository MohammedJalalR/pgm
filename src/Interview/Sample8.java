package Interview;

public class Sample8 {

	public static void main(String[] args) {

		int[] arr = { 4, 1, 2, 5 };
		int sum = 0;
		int fl = 0;
		int sl = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > fl) {
				sl = fl;
				fl = arr[i];

			} else if (arr[i] > sl) {
				sl = arr[i];
			}
		}
		sum = sum + fl + sl;
		System.out.println(sum);

	}

}
