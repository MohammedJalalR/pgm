package fesosececo;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 1267;
		int count = 0;
		while (no != 0) {
			int rem = no % 10;
			if (rem % 2 == 0) {
				count++;
			}

			no = no / 10;
		}
		System.out.println(count);
	}

}
