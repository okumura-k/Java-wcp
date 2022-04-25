//クラスAの中に、内部クラスBを持つ例
public class A {
	public class B {
	}
}

//内部クラスBの中に、さらに内部クラスCを持つ例
public class A {
    public class B {
        public class C {
        }
    }
}

//内部クラスではなくても、1ファイルに複数のクラスを持つことも可
public class A {

}

class B {

}