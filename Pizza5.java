
public class Pizza5 {

	String item; // ピザ名
	int price; // 単価
	int amount; // 販売数量 追加★
	int sales; // 販売金額 追加★

	Pizza5(String i, int p, int a) {
		item = i;
		price = p;
		amount = a;
		sales = calc();
	}

	// 引数で販売数量を指定し、単価＊販売数量で販売金額を計算し、戻り値でその計算した販売金額を返します。
	public int calc() {
		return price * amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
		sales = calc();
	}

	public void show() {
		System.out.println("ピザ名：" + item);
		System.out.println("単価：" + price);
		System.out.println("販売数量：" + amount);
		System.out.println("販売金額：" + sales);// フォールド参照★
	}

	public static void main(String[] args) {
		Pizza5 pizzaA = new Pizza5("シーフードミックス", 2700, 1);
		pizzaA.show();
		pizzaA.setAmount(2);// 追加★
		pizzaA.show();

		System.out.println("----------");
		// 別のお客さんには、上記と同じ商品を異なる単価で販売
		// クーポン券あり、誕生月等
		Pizza5 pizzaB = new Pizza5("シーフードミックス", 2200, 1);
		pizzaB.show();

		System.out.println("----------");
		Pizza5 pizzaC = new Pizza5("ワイルド・ガーリック", 2570, 2);
		pizzaC.show();
	}

}
