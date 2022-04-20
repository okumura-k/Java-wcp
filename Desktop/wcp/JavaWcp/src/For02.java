
public class For02 {
	public static void main(String[] args) {
		//拡張for文とは、配列やコレクションの全要素に対して、繰り返し処理を行なう制御文
		int[] array = { 1, 2, 3, 4, 5 };
		// 配列の要素を順番にnumberに代入し、要素分繰り返す
		for (int number : array) {
			System.out.println("For02 = " + number);
		}
	}
}

/*for (型 変数名：配列やコレクションの変数) {
    ブロック(繰り返し処理)
}*/