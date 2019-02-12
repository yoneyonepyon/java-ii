
public class Castle {

	String name; // 名前
	String location; // 所在地
	int height; // 高さ（単位 m）
	String master; // 城主

	public Castle(String n, String l, int h, String m) {
		name = n;
		location = l;
		height = h;
		master = m;
	}

	public String toString() {
		return "城　名前=" + name +
				", 所在地=" + location +
				", 高さ=" + height +
				", 城主=" + master;
	}

	private void show() {
		System.out.println(this.toString());
	}

	int compareHeight(Castle t) {
		if (height < t.height) {
			return -1;
		} else if (height == t.height) {
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Castle t1 = new Castle("江戸城", "東京都千代田区", 58, "徳川家康");
		t1.show();
		System.out.println("----------");
		Castle t2 = new Castle("小田原城", "神奈川県小田原市", 39, "北条氏康");
		t2.show();
		System.out.println("----------");
		System.out.println("江戸城の高さは小田原城の高さと比べ、" + t1.compareHeight(t2));
	}

}
