
public class While01 {
	public static void main(String[] args) {
		// while文とは、指定の条件が「true」の間、繰り返し処理を行なう制御文
		int number = 1;
		// numberが50未満の場合、ブロックの処理を行なう
		while (number < 50) {
			// ブロック：
            // numberにnumber * 2 を代入して、numberを出力
			number *= 2;
			System.out.println("while01 = " + number);
		}
	}
}

/*	while (条件式) {
	  ブロック（繰り返し処理）
}*/