
public class EMCard {

	int zandaka = 1000; // カード残高 (円)

	public static void main(String[] args) {
		EMCard p1 = new EMCard();
		p1.show(); // 残高：1000円 ←showメソッドの実行
		p1.pay(3000); // 残高不足 ←3000円の支払いを試みる
		System.out.println("----------");
		p1.pay(240); // 支払：240円 ←240円の支払い
		p1.show(); // 残高：760円 ←showメソッドの実行
		p1.charge(5000);
		p1.show(); // 残高：5760円 ←5000円のチャージ、showメソッドの実行
		p1.pay(2100); // 支払：2100円 ←2100円の支払い
		p1.show(); // 残高：3660円 ←showメソッドの実行

	}

	public void show() {
		System.out.println("残高：" + zandaka + "円");
	}

	// カードへのチャージ用メソッドです。
	public void charge(int yen) {
		zandaka += yen;
	}

	// カードでの支払い用メソッドです。
	void pay(int yen) {
		if (zandaka >= yen) {
			zandaka -= yen;
			System.out.println("支払：" + yen + "円");
		} else {
			System.out.println("残高不足");
		}
	}

}
