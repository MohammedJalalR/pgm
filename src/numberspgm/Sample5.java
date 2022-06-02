package numberspgm;

public class Sample5 {
	public static void main(String[] args) {
		int no = 12345;
		String n = Integer.toString(no);
		for (int i = n.length() - 1; i >= 0; i--) {
			System.out.println(n.charAt(i));
		}
	}
}
