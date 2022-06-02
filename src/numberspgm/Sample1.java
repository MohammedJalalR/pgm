package numberspgm;

public class Sample1 {
	public static void main(String[] args) {
		int no = 12345;
		String n = Integer.toString(no);

		for (int i = 0; i < n.length(); i++) {
			if (i % 2 == 0) {
				System.out.println(n.charAt(i));
			}
		}

	}
}
