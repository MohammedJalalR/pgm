package arraypgms;

public class Sample6 {
	
	/*static int add(int no)
	{
		int sum = 0;
		while (no != 0) {

			int rem = no % 10;
			sum = sum + rem;
			no = no / 10;

		}
	return sum;

	}
*/
	public static void main(String[] args) {

		int arr[] = { 23, 89, 90, 34, 15, 21, 30, 19, 45, 11, 8, 10, 9 };
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
       System.out.println(sum);
	}

}
