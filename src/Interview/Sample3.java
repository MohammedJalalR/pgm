package Interview;

public class Sample3 {

	public static void main(String[] args) {
		String s1 = "apple";
		char s2 = ' ';
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			s2 = s1.charAt(i);
			if (s2 == 'a' || s2 == 'e' || s2 == 'i' || s2 == '0' || s2 == 'u') {
				System.out.print(s2+" ");
				count++;
			}

		}

		System.out.println(count);
	}

}
