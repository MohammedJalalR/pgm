package numberspgm;

public class Sample {

	public static void main(String[] args) {
		int no = 12345;
		String n = Integer.toString(no);

		for (int i = 0; i < n.length(); i++) {
			
			System.out.println(n.charAt(i));
		}

	}

}
