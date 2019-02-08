
public class Fruit {

	String name; // 果物の名前
	int price; // 単価

	public Fruit(String n, int p) {
		name = n;
		price = p;
	}

	public static void main(String[] args) {
		Fruit f1 = new Fruit("りんご", 100);
		int hanbaiKakaku = f1.buy(5);
		System.out.println(f1.name + "," + hanbaiKakaku);
		Fruit f2 = new Fruit("グレーフルーツ", 150);
		System.out.println(f2.name + "," + f2.buy(1));
	}

	public int buy(int cnt) {
		// 「単価」＊ 「個数」
		return price * cnt;
	}

}
