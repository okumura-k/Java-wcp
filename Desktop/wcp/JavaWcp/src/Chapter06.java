
public class Chapter06 {
	public static void main(String[] args) {
		// == 演算子は文字列の比較に用いることもできる

//	    String a = "applepie";
//	    String b = "apple";
//	    
//	    c == a == b;  //c == true

		// 上記はNG文
		// ※ 一般的に文字列比較をしたい際に＝＝を使うのは避ける

		String a = "applePie";
		String d = "apple";
		String e = d + "Pie";
		boolean c;
		c = a == e; // c = false

//		String a = "applePie";
		String f = new String("applePie");
		c = a == f; // c =false

//		c = a.equals(b); // c = true
//		c = a.equals(e); // c = true
//		c = a.equals(f); // c = true

		System.out.println(c);
	}

}
