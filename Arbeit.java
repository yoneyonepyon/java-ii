
public class Arbeit {

	String name; // アルバイトの名前
	int jikyuu; // 時給

	public Arbeit(String n, int j) {
		name = n;
		jikyuu = j;
	}

	public static void main(String[] args) {
		Arbeit a1 = new Arbeit("田中", 840);
		int tingin = a1.calc(5);
		System.out.println(a1.name + "," + tingin);
		Arbeit a2 = new Arbeit("吉田", 820);
		System.out.println(a2.name + "," + a2.calc(5));
	}

	public int calc(int hour) {
		// 「時給」＊ 「時間」
		return jikyuu * hour;
	}

}
