package extend.human;

public class Human {
	private String name;
	protected int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getname() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
}

//復習済み