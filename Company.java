
public class Company {

	String companyName;// 会社名
	int asset;// 資産
	int debt;// 負債

	public Company(String name, int a, int d) {
		companyName = name;
		asset = a;
		debt = d;
	}

	public static void main(String[] args) {
		Company c1 = new Company("H製作所", 9185629, 6744240);
		int capital = c1.getCapital();
		int capitalRate = c1.getCapitalRate();
		System.out.println(c1.companyName + "," + capital +
				"," + capitalRate);

		Company c2 = new Company("M電機", 3332679, 2223654);
		System.out.println(c2.companyName + "," + c2.getCapital() +
				"," + c2.getCapitalRate());
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
