
public class Pizza1 {

	String item; // ピザ名
	int price; // 単価

	Pizza1(String i, int p) {
		item = i;
		price = p;
	}

	// 引数で販売数量を指定し、単価＊販売数量で販売金額を計算し、戻り値でその計算した販売金額を返します。
	public int calc(int amount) {
		return price * amount;
	}

	public static void main(String[] args) {
		Pizza1 pizzaA = new Pizza1("シーフードミックス", 2700);
		System.out.println("ピザ名：" + pizzaA.item);
		System.out.println("単価：" + pizzaA.price);
		int amount = 1;// 販売数量
		System.out.println("販売数量：" + amount);
		int sales = pizzaA.calc(amount);
		System.out.println("販売金額：" + sales);

		System.out.println("----------");
		// 別のお客さんには、上記と同じ商品を異なる単価で販売
		// クーポン券あり、誕生月等
		Pizza1 pizzaB = new Pizza1("シーフードミックス", 2200);
		System.out.println("ピザ名：" + pizzaB.item);
		System.out.println("単価：" + pizzaB.price);
		amount = 1;// 販売数量
		System.out.println("販売数量：" + amount);
		System.out.println("販売金額：" + pizzaB.calc(amount));
	}

}
