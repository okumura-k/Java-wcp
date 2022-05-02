
public class Switch01 {
	public static void main(String[] args) {
		int val = 2;
		switch (val) {
		case 3:
			System.out.println("よくできました！");
			break;
		case 2:
			System.out.println("普通でした！");
			break;
		default:
			System.out.println("がんばろう！");
		}
	}
}

/*  基本構文
		switch (式（変数や値）){
			case 値:
			    ブロック(処理);
			    break;
			case 値:
			    ブロック(処理);
			    break;
			default:
			    ブロック(処理);
		}
*/

//  復習済み