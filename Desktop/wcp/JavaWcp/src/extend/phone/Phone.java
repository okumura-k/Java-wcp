package extend.phone;

public interface Phone {
	final int MAX_NUMBER_DIGITS = 11;

	void call(String Number);

	default void powerOff() {
		System.out.println("電源を切ります。");
	}
}

// 復習済み