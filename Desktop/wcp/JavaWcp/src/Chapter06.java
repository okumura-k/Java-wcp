
public class Chapter06 {
	public static void main(String[] args) {
		// 文字列を連結する場合の演算子は算術演算子の足し算と同じ「+」
		// a + b = a と b の文字列を連結する

		String a = "100";
		String b = "200";
		String c;

		c = a + b; // c = 100200
		c = "あ" + "い"; // c = あい

		System.out.println(c);
	}

}
