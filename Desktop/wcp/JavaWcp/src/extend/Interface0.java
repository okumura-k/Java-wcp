/*	・interface基本構文
 * 		[public] interface インターフェース名 extends インターフェース名, インターフェース名 {
		    // フィールドの宣言（定数）
		    (public static final) 定数の型 定数名 = 初期値;
		    // メソッドの宣言（抽象メソッド）
		    (public abstract) 戻り値の型 メソッド名(引数);
		}
		
	・インターフェースの実装
		修飾子 class クラス名 implements インターフェース名, インターフェース名 {
		    // インターフェースを実装したメソッドなど
		}
		
	。インターフェースのインスタンス生成
		SampleClass sampleClass = new SampleClass();
		// アップキャスト
		SampleInterface upCastInterface = sampleClass;
		// ダウンキャスト
		SampleClass downCastClass = (SampleClass) upCastInterface;
 */