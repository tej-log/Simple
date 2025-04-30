package Com.nt.test;

public class ReverseName {
	public static void main(String[] args) {
		String str = "tejas";
		String rev = " ";
		int leng = str.length();
		for (int i = leng - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
			System.out.println(rev);
			StringBuffer sb = new StringBuffer(str);
			System.out.println(sb.reverse());
			System.out.println(sb);
			StringBuilder sb1 = new StringBuilder(str);
			System.out.println(sb1.reverse());
		}

	}
}