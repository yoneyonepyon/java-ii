
public class Country {

	String name;// 国名
	int area;// 国土面積
	int forest;// 森林面積

	Country(String n, int a, int f) {
		name = n;
		area = a;
		forest = f;
	}

	public int getRation() {
		// 森林面積 ＊ 100 / 国土面積
		return forest * 100 / area;
	}

	public static void main(String[] args) {
		Country japan = new Country("日本", 36450, 24979);
		int ration = japan.getRation();
		System.out.println(japan.name + "," + ration);
		Country china = new Country("中国", 942530, 206861);
		System.out.println(china.name + "," + china.getRation());
		// 通常は、上文のように、引数に直接メソッド呼び出しします。
	}

}
