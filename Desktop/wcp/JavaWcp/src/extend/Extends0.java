/*	・final修飾子が指定されたクラス
  	
	 　 //final修飾子を指定
		final public class Human {
		}
	  
	 　 //Humanが継承禁止のため、コンパイルエラー
		final public class Employee extends Human {
		}
  
  
  	・アップキャスト、ダウンキャスト
  	
	  	SubClass subclass = new SubClass();
	 	//アップキャスト
		SuperClass upCastClass = subclass;
		//ダウンキャスト
		SubClass downCastClass = (SubClass) upCastClass;
		
	
	・super
	
		//親インスタンスのフィールド参照
		super.フィールド;
		// 親インスタンスのメソッド呼び出し
		super.メソッド();
		
		・・サブクラスからスーパークラスのコンストラクタを呼び出す場合
		
		class SubClass extends SuperClass {
		    // コンストラクタ
		    SubClass() {
		        // 最初にスーパークラスのコンストラクタを呼び出す
		        super(引数);
		        // サブクラスでの初期処理
			}
		}
 * */