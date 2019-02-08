
public class Pizza2 {

	String item; // ピザ名
	int price; // 単価
	int amount; // 販売数量 追加★

	Pizza2(String i, int p, int a) {
		item = i;
		price = p;
		amount = a;
	}

	// 引数で販売数量を指定し、単価＊販売数量で販売金額を計算し、戻り値でその計算した販売金額を返します。
	public int calc() {
		return price * amount;
	}

	public static void main(String[] args) {
		Pizza2 pizzaA = new Pizza2("シーフードミックス", 2700, 1);
		System.out.println("ピザ名：" + pizzaA.item);
		System.out.println("単価：" + pizzaA.price);
		System.out.println("販売数量：" + pizzaA.amount);
		int sales = pizzaA.calc();
		System.out.println("販売金額：" + sales);

		System.out.println("----------");
		// 別のお客さんには、上記と同じ商品を異なる単価で販売
		// クーポン券あり、誕生月等
		Pizza2 pizzaB = new Pizza2("シーフードミックス", 2200, 1);
		System.out.println("ピザ名：" + pizzaB.item);
		System.out.println("単価：" + pizzaB.price);
		System.out.println("販売数量：" + pizzaB.amount);
		System.out.println("販売金額：" + pizzaB.calc());
	}

}
