
public class Student {

	String name;// 名前
	int ten1; // 国語の点数
	int ten2; // 数学の点数

	Student(String n, int t1, int t2) {
		name = n;
		ten1 = t1;
		ten2 = t2;
	}

	public static void main(String[] args) {
		Student s1 = new Student("安西", 90, 80);
		int heikin = s1.getHeikin();
		int max = s1.getMax();
		int min = s1.getMin();
		System.out.println(s1.name + "," + heikin +
				"," + max + "," + min);

		Student s2 = new Student("木村", 50, 40);
		System.out.println(s2.name + "," + s2.getHeikin() +
				"," + s2.getMax() + "," + s2.getMin());
	}

	// 国語の点数と、数学の点数の平均を計算し、その計算値を戻り値で返します。
	public int getHeikin() {
		return (ten1 + ten2) / 2;
	}

	// 国語の点数と、数学の点数の大きい方の点数を戻り値で返します。
	public int getMax() {
		return ten1 > ten2 ? ten1 : ten2;
	}

	// 国語の点数と、数学の点数の小さい方の点数を戻り値で返します。
	public int getMin() {
		return ten1 < ten2 ? ten1 : ten2;
	}

}
