
public class Player {

	String name; // 名前(name)
	int uniformNumber; // 背番号(uniformNumbe)
	int age; // 年齢(age)
	int height; // 身長(height)単位cm、
	int weight; // 体重(weight)単位kg

	public Player(String name, int uniformNumber, int age, int height, int weight) {
		super();
		this.name = name;
		this.uniformNumber = uniformNumber;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "選手 [" +
				"名前=" + name +
				", 背番号=" + uniformNumber +
				", 年齢=" + age +
				", 身長=" + height +
				", 体重=" + weight + "]";
	}

	public void show() {
		System.out.println(this);
	}

	public boolean higherThan(int h) {
		return height > h;
	}

	public String compareAges(Player p) {
		double a = age;
		double b = p.age;
		if (a < b) {
			return "小さい（若い）";
		} else if (a == b) {
			return "等しい";
		} else {
			return "大きい（高齢）";
		}
	}

}
