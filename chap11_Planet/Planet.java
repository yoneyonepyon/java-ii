
public class Planet {

	String name; // 惑星名
	int diameter; // 直径

	public Planet(String n, int d) {
		name = n;
		diameter = d;
	}

	public static void main(String[] args) {
		System.out.println("惑星のテスト------------");
		Planet p1 = new Planet("地球", 12756);
		p1.show();
		System.out.println("----------");
		Planet p2 = new Planet("水星", 4878);
		p2.show();
		System.out.println("----------");
		// 地球水星大きい
		System.out.println(p1.name + "の直径は" +
				p2.name + "の直径と比べ、" + p1.compareDiameter(p2));
	}

	public String compareDiameter(Planet p2) {
		if (diameter < p2.diameter) {
			return "小さい";
		} else if (diameter == p2.diameter) {
			return "等しい";
		} else {
			return "大きい";
		}
	}

	public String toString() {
		return "惑星 名前=" + name + ", 直径=" + diameter;
	}

	public void show() {
		System.out.println(this.toString());
	}

	public void show(int i) {
		System.out.println("　　" + i + ". " + this.toString());
	}

}
