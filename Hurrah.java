
public class Hurrah {

	String msg = "Hey"; // この初期値で設定するものは ？
	int count = 3; // この初期値で設定するものは ？

	void checkMsg() {
		System.out.println("msg=" + msg);
	}

	// ここで、引数で指定された値を
	// フィールドに設定してください。
	void setData(String msg, int count) {
		this.msg = msg;
		this.count = count;
	}

	void shout() {
		// 以下の実行結果を参考に
		// この処理を作成してください。ここでprintln等を実行します。
		// なお、「shout」は シャウト と発音し、
		// （フレー・フレーなどと）大声で叫ぶという意味です。
		for (int i = 0; i < count; i++) {
			System.out.print(msg + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Hurrah h1 = new Hurrah();
		h1.checkMsg();
		h1.shout();
		System.out.println("----------");

		Hurrah h2 = new Hurrah();
		h2.setData("Hurrah", 1);
		h2.checkMsg();
		h2.shout();
		System.out.println("----------");

		h2.setData("Let's GO!", 5);
		h2.checkMsg();
		h2.shout();
		System.out.println("----------");

		h1.setData("Boo", 3);
		h1.checkMsg();
		h1.shout();
	}

}
