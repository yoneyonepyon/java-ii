
public class EMCard2 {

	int zandaka = 1000; // カード残高 (円)
	String name = "No　name"; // カードの名前

	public EMCard2(String n) {
		name = n;
	}

	public static void main(String[] args) {
		EMCard2 small = new EMCard2("小銭カード");
		EMCard2 big = new EMCard2("大金カード");
		small.showAll(); // ←small の showAllメソッドの結果
		big.charge(20000); // ←big で 20000円をチャージの結果
		big.showAll(); // ←big の showAllメソッドの結果
		System.out.println("----------");
		big.pay(3000); // ←big で 3000円を支払い、
		big.showAll(); // ←big の showAllメソッドの結果
		System.out.println("----------");
		small.pay(240); // ←small で 240円を支払い、
		small.charge(100); // ←small で 100円チャージし
		small.showAll(); // ←small の showAllメソッドの結果
		System.out.println("----------");
		System.out.println("小銭カードの残高は大金カードの残高と比べ、" + small.compareZandaka(big)); // -1
	}

	public void show() {
		System.out.println("残高：" + zandaka + "円");
	}

	public void showAll() {
		printName();
		show();
	}

	public void printName() {
		System.out.print("[" + name + "]");
	}

	// カードへのチャージ用メソッドです。
	public void charge(int yen) {
		zandaka += yen;
		printName();
		System.out.print("チャージ：" + yen + "円／");
		show();
	}

	// カードでの支払い用メソッドです。
	public void pay(int yen) {
		if (zandaka >= yen) {
			zandaka -= yen;
			printName();
			System.out.print("支払：" + yen + "円／");
			show();
		} else {
			printName();
			System.out.print("残高不足／");
			show();
		}
	}

	public int compareZandaka(EMCard2 other) {
		if (zandaka == other.zandaka) {
			return 0;
		} else if (zandaka > other.zandaka) {
			return 1;
		} else {
			return -1;
		}
	}

}
