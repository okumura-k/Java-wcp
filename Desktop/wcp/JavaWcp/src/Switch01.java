
public class Switch01 {
	public static void main(String[] args) {
		// switch文とは、変数の値を条件にして処理を分岐する制御文
		int val = 2;
		switch (val) {
		// case：値が3の場合にブロックを実行
		case 3:
			System.out.println("よくできました!");
			// break：switch文を終了する
			break;
		case 2:
			System.out.println("ふつうでした！");
			break;
		// default：全てのcaseの値に一致しない場合にブロックを実行
		default:
			System.out.println("がんばろう！");
		}
	}
}

//	swich (式 (変数や値) {
//	case 値：
//		ブロック（処理）；
//		break;
//	case ～～
//		～～
//		～～
//	default:
//		～～
//	}