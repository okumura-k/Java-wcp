
public class Chapter06 {
	public static void main(String[] args) {
		// 複数の式を条件とする場合に使用

		// a && b = a と b の両方が true の場合に true
		// a || b = a または b が true の場合に true
		// !a = a が false の場合に true

		boolean a = true;
		boolean b = false;
		boolean c;

		c = a && true; // c = true
		c = a && false; // c = false
		c = b || true;
		c = b || false;
		c = !a;
		c = !b;

		System.out.println(c);
	}

}
