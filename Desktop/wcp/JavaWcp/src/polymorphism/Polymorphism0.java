/*	・オーバーライド
 		・条件
 			メソッド名が同じである
			引数の型と数が同じである
			戻り値の型が同じか、スーパークラス・サブクラスの関係にある
			例外の型が同じか、スーパークラス・サブクラスの関係にある
			アクセス修飾子が同じか、スーパークラスの制約の方が厳しい
			
			条件満たしていれば	@override記述
		
		// スーパークラス
		public class SuperClass {
		    void overrideMethod() {
		        // スーパークラスの処理
		    }
		}
		
		// サブクラス
		class SubClass extends SuperClass {
		    // スーパークラスのメソッドをオーバーライド
		    @Override
		    void overrideMethod() {
		        // サブクラスの処理
		    }
		}
		
		・final修飾子が指定されたメソッド
			public class Student extends Human {
			    // オーバーライド禁止のため、コンパイルエラー
			    public String getName() {
			        return "名前は" + this.name + "です。";
			    }
			}
 */