package extend;

import extend.animal.Dog;

public class Abstract01 {
	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat();
		dog.cry();
	}
}

/* 抽象クラスの宣言
		アクセス修飾子 abstract class クラス名 {
		    // 抽象メソッドの宣言
		    アクセス修飾子 abstract 戻り値の型 メソッド名(引数);
		}
*/