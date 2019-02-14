/*
 * このプログラムは学習を目的としています 実在の人物および団体とは関係ありません
 */
public class NetShoppingMall {

	final static int[] IDS = { 101, 222 };
	final static String[] NAMES = { "楽天市場", "Yahoo！ショッピング" };
	final static int[][] WEBSHOP_IDS = { { 11, 22, 50, 60 }, {} };

	int id; // ・ ネットショッピングモールのid値
	String name; // ・ ネットショッピングモールの名前
	WebShop[] webshops; // ・ ネットショッピングモールに出店している店情報

	public static void main(String[] args) {
		NetShoppingMall obj1 = new NetShoppingMall(101);
		System.out.println(obj1);
		NetShoppingMall obj2 = new NetShoppingMall(222);
		System.out.println(obj2);

		NetShoppingMall obj3 = new NetShoppingMall(101);
		System.out.println(obj3.getWebShop(11));

		obj3 = new NetShoppingMall(101);
		System.out.println(obj3.getWebShop(90));

		obj3 = new NetShoppingMall(101);
		System.out.println(obj3.getWebShop(11).getProduct(10));

		obj3 = new NetShoppingMall(222);
		System.out.println(obj3.getWebShop(11));
	}

	public WebShop getWebShop(int id) {
		WebShop webshop = null;
		for (WebShop w : webshops) {
			if (id == w.id)
				webshop = w;
		}
		return webshop;
	}

	@Override
	public String toString() {
		String strings = "";
		for (WebShop w : webshops) {
			strings += w;
			strings += "\n\n";
		}
		return "NetShoppingMall [id=" + id + ", name=" + name + "]\n" + strings;
	}

	public NetShoppingMall(int id) {
		for (int i = 0; i < IDS.length; i++) {
			if (id == IDS[i]) {
				this.id = IDS[i];
				this.name = NAMES[i];
				this.webshops = new WebShop[WEBSHOP_IDS[i].length];
				for (int j = 0; j < webshops.length; j++) {
					webshops[j] = new WebShop(WEBSHOP_IDS[i][j]);
				}
				break;
			}
		}

	}

}
