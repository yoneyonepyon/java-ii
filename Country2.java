
public class Country2 {

	String name;// 国名
	int area;// 国土面積
	int forest;// 森林面積
	int ration;// 比率 追加★

	Country2(String n, int a, int f) {
		name = n;
		area = a;
		forest = f;
		ration = getRation();
	}

	public int getRation() {
		// 森林面積 ＊ 100 / 国土面積
		return forest * 100 / area;
	}

	public static void main(String[] args) {
		Country2 japan = new Country2("日本", 36450, 24979);
		// int ration = japan.getRation();//削除★
		// フィールドで取得★
		System.out.println(japan.name + "," + japan.ration);
		Country2 china = new Country2("中国", 942530, 206861);
		// フィールドで取得★
		System.out.println(china.name + "," + china.ration);
	}

}
