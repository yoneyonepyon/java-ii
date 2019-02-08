
public class Company2 {

	String companyName;// 会社名
	int asset;// 資産
	int debt;// 負債
	int capital;// 純資産 追加★
	int capitalRate;// 自己資本比率 追加★

	public Company2(String name, int a, int d) {
		companyName = name;
		asset = a;
		debt = d;
		capital = getCapital();
		capitalRate = getCapitalRate();
	}

	public static void main(String[] args) {
		Company2 c1 = new Company2("H製作所", 9185629, 6744240);
		// int capital = c1.getCapital();//削除★
		// int capitalRate = c1.getCapitalRate();//削除★

		// フィールドで取得★
		System.out.println(c1.companyName + "," + c1.capital + "," + c1.capitalRate);

		Company2 c2 = new Company2("M電機", 3332679, 2223654);
		// フィールドで取得★
		System.out.println(c2.companyName + "," + c2.capital + "," + c2.capitalRate);
	}

	// 資産と負債から、純資産を計算し、その計算値を戻り値で返します。
	// 資産 － 負債
	public int getCapital() {
		return asset - debt;
	}

	// 資産と純資産から、自己資本比率を計算し、その計算値を戻り値で返します。
	// 純資産 ＊ 100 / 資産
	public int getCapitalRate() {
		int capital = getCapital();
		return capital * 100 / asset;
	}

}
