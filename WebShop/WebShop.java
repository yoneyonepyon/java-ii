public class WebShop {

	final static int[] WEBSHOP_IDS = { 11, 22, 50, 60 };
	final static String[] WEBSHOP_NAMES = { "ヤマダ電機", "ヨドバシカメラ", "ニトリ", "ホーマック" };
	final static Product[][] WEBSHOP_PRODUCTS = { {
			new Product(10, "洗濯機日立NW-5MR-W", 100),
			new Product(12, "洗濯機東芝AW-70DL-W", 20),
	}, {
			new Product(21, "洗濯機パナソニックNA-F45B6-A", 20),
			new Product(26, "洗濯機日立NW-5MR-W", 50),
	}, {
			new Product(31, "ローテーブルHNT-0025 DBR", 10),
			new Product(37, "折りたたみローテーブルVD7550-WH", 20),
			new Product(38, "折りたたみチェア　タンゴ4479 B", 60)
	}, {} };

	int id; // ・ 出店している店のid値
	String name; // ・ 出店している店の名前
	Product[] products; // ・ 出店している店で扱っている商品情報

	public static void main(String[] args) {
		WebShop w1 = new WebShop(11);
		System.out.println(w1);
		w1 = new WebShop(20);
		System.out.println(w1);
		w1 = new WebShop(50);
		System.out.println(w1);
		w1 = new WebShop(60);
		System.out.println(w1);
		WebShop obj1 = new WebShop(11);
		System.out.println(obj1.getProduct(10));
		WebShop obj2 = new WebShop(11);
		System.out.println(obj2.getProduct(123));
		WebShop obj3 = new WebShop(60);
		System.out.println(obj3.getProduct(11));
	}

	@Override
	public String toString() {
		String products = "";
		for (Product p : this.products) {
			products += "\n";
			products += p.toString();
		}
		return "WebShop [id=" + id + ", name=" + name + "]" + products;
	}

	public int getId() {
		return id;
	}

	public Product getProduct(int id) {
		Product p = null;
		for (Product product : products) {
			if (id == product.id)
				p = product;
		}
		return p;
	}

	public WebShop(int id) {
		for (int i = 0; i < WEBSHOP_IDS.length; i++) {
			if (id == WEBSHOP_IDS[i]) {
				this.id = WEBSHOP_IDS[i];
				this.name = WEBSHOP_NAMES[i];
				this.products = WEBSHOP_PRODUCTS[i];
				break;
			}
		}
	}

}
