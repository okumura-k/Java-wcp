package extend.human;

public class Employee extends Human {
	private String department;

	public Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}

	public String getEmployeeProfile() {
		String profile = "年齢は" + this.age + "です";
		profile += "サラリーマンで、部署は" + this.department + "です";
		return profile;
	}
}

//修飾子 class クラス名 extends スーパークラス名 {
//	サブクラスの処理
//}