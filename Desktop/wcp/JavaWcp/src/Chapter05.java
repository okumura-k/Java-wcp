
public class Chapter05 {
	public static void main(String[] args) {
		// プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
		long long1 = 1200000000000L;
		double double1 = 12345.6789d;
		boolean boolean1 = true;

		System.out.println(long1);
		System.out.println(double1);
		System.out.println(boolean1);

		// ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
		Float float1 = 0.12f;
		Integer integer1 = 123;
		Character character1 = 'あ';

		System.out.println(float1);
		System.out.println(integer1);
		System.out.println(character1);

		// 要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
		int[] array1 = new int[5];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		array1[4] = 50;

		System.out.println(array1[3]);

	}
}

// 模範解答
//public class Chapter05 {
//    public static void main(String[] args) {
//        long l = 10000000000L;
//        System.out.println(l);
//        double d = 3.14;
//        System.out.println(d);
//        boolean b = true;
//        System.out.println(b);
//
//        Integer i = 100;
//        System.out.println(i);
//        Float f = 1.4142f;
//        System.out.println(f);
//        Character c = 'う';
//        System.out.println(c);
//
//        int[] array = { 0, 10, 20, 30, 40 };
//        System.out.println(array[3]);
//    }
//}
