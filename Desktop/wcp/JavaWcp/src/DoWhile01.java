
public class DoWhile01 {
	public static void main(String[] args) {
		// do-while文とは、while文と同じように指定の条件が「true」の間、繰り返し処理を行なう制御文
		// while文との記述上の違いは条件式の位置
		int number = 1;
		do {
			// numberにnumber * 2 を代入して、numberを出力
			number *= 2;
			System.out.println("DoWhile01 = " + number);
			// numberが50未満の場合、ブロックの処理をループ実行する
		} while (number < 50);
	}
}

/*
 * do { 
 * 	ブロック（繰り返し処理）
 *  } while (条件式);
 */