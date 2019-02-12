
public class Tower {

	String name; // 名前
	String location; // 所在地
	int height; // 高さ（単位 m）
	int completion; // 竣工年（完成した年[西暦年]）

	public Tower(String n, String l, int h, int c) {
		name = n;
		location = l;
		height = h;
		completion = c;
	}

	public String toString() {
		return "タワー　名前=" + name +
				", 所在地=" + location +
				", 高さ=" + height +
				", 竣工年=" + completion;
	}

	public void show() {
		System.out.println(this.toString());
	}

	int compareHeight(Tower t) {
		if (height < t.height) {
			return -1;
		} else if (height == t.height) {
			return 0;
		} else {
			return 1;
		}
	}

	int compareCompletion(Tower t) {
		if (completion < t.completion) {
			return -1;
		} else if (completion == t.completion) {
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Tower t1 = new Tower("東京タワー", "東京都港区", 333, 1958);
		t1.show();
		System.out.println("----------");
		Tower t2 = new Tower("東京スカイツリー", "東京都墨田区", 634, 2012);
		t2.show();
		System.out.println("----------");
		System.out.println("東京タワーの高さは東京スカイツリーの高さと比べ、" + t1.compareHeight(t2));
		System.out.println("東京タワーの竣工年は東京スカイツリーの竣工年と比べ、" + t1.compareCompletion(t2));
	}

}
