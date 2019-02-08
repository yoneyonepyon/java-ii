
public class Year {

	int nen;// 西暦の年

	Year(int n) {
		nen = n;
	}

	public static void main(String[] args) {
		Year y1 = new Year(2018);
		boolean uruudosi = y1.uruuDosi();
		int heiseiNen = y1.getHeiseiNen();
		System.out.println(y1.nen + "," + uruudosi +
				"," + heiseiNen);

		Year y2 = new Year(2020);
		System.out.println(y2.nen + "," + y2.uruuDosi() +
				"," + y2.getHeiseiNen());
	}

	// 西暦年が、うるう年か調べます。
	public boolean uruuDosi() {
		return nen % 4 == 0;
	}

	// 西暦年から「平成」の年を計算し、その計算値を戻り値で返します。
	public int getHeiseiNen() {
		return nen - 1988;
	}

}
