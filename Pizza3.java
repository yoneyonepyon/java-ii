
public class Pizza3 {

	String item; // ピザ名
	int price; // 単価
	int amount; // 販売数量 追加★
	int sales; // 販売金額 追加★

	Pizza3(String i, int p, int a) {
		item = i;
		price = p;
		amount = a;
		sales = calc();
	}

	// 引数で販売数量を指定し、単価＊販売数量で販売金額を計算し、戻り値でその計算した販売金額を返します。
	public int calc() {
		return price * amount;
	}

	public static void main(String[] args) {
		Pizza3 pizzaA = new Pizza3("シーフードミックス", 2700, 1);
		System.out.println("ピザ名：" + pizzaA.item);
		System.out.println("単価：" + pizzaA.price);
		System.out.println("販売数量：" + pizzaA.amount);
		System.out.println("販売金額：" + pizzaA.sales);// フォールド参照★

		System.out.println("----------");
		// 別のお客さんには、上記と同じ商品を異なる単価で販売
		// クーポン券あり、誕生月等
		Pizza3 pizzaB = new Pizza3("シーフードミックス", 2200, 1);
		System.out.println("ピザ名：" + pizzaB.item);
		System.out.println("単価：" + pizzaB.price);
		System.out.println("販売数量：" + pizzaB.amount);
		System.out.println("販売金額：" + pizzaB.sales);// フォールド参照★
	}

}
