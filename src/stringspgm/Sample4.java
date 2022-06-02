package stringspgm;

public class Sample4 {
	public static void main(String[] args) {

		String s1 = "JavaQspiders";

		for (int i = s1.length()-1; i >= 0; i--) {
			if (i % 2 == 1) {
				char ch = s1.charAt(i);

				System.out.print(ch);
			}

		}

	}
}
