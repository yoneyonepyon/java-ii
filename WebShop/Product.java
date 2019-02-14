/*
 * このプログラムは学習を目的としています 実在の人物および団体とは関係ありません
 */
public class Product {

	int id; // 商品id
	String name; // 商品名
	int zaikosuu; // 在庫数

	public Product(int id, String name, int zaikosuu) {
		super();
		this.id = id;
		this.name = name;
		this.zaikosuu = zaikosuu;
	}

	// テスト
	public static void main(String[] args) {
		Product obj1 = new Product(10, "洗濯機日立NW-5MR-W", 100);
		obj1.kounyuu(5);
		System.out.println(obj1);
		System.out.println(new Product(10, "洗濯機日立NW-5MR-W", 100).equals(
				new Product(26, "洗濯機日立NW-5MR-W", 50)));
		System.out.println(new Product(10, "洗濯機日立NW-5MR-W", 100).equals(
				new Product(12, "洗濯機東芝AW-70DL-W", 20)));
		System.out.println(obj1.getId());
		System.out.println(obj1.getName());
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", zaikosuu=" + zaikosuu + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private void kounyuu(int i) {
		zaikosuu -= i;
	}

}
