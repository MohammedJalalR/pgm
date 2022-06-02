package stringspgm;

public class Sample2 {
	public static void main(String[] args) {

		String s1 = "JavaQspiders";

		for (int i = 0; i < s1.length(); i++) {
			if (i % 2 == 1) {
				char ch = s1.charAt(i);

				System.out.print(ch);
			}

		}

	}
}
