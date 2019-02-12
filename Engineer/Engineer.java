
public class Engineer {

	String name; // 名前
	int basicSalary; // 基本給 単位 (円)
	int hireYears; // 勤務年数
	int overTime; // 残業時間

	public Engineer(String n, int bs, int hy, int ot) {
		name = n;
		basicSalary = bs;
		hireYears = hy;
		overTime = ot;
	}

	// 基本給の加算
	void addBasicSalary(int displacement) {
		basicSalary += displacement;
	}

	// 給与の取得
	int getSalary() {
		return basicSalary + 50000 + overTime * 2000;
	}

	public String toString() {
		return "技術者 氏名=" + name +
				", 基本給=" + basicSalary +
				", 勤務年数=" + hireYears +
				", 給与=" + getSalary() +
				", 残業時間=" + overTime;
	}

	public void show() {
		System.out.println(this.toString());
	}

	public int compareHireYears(Engineer other) {
		if (hireYears < other.hireYears) {
			return -1;
		} else if (hireYears == other.hireYears) {
			return 0;
		} else {
			return 1;
		}
	}

	public int compareSalary(Engineer other) {
		int thisSalary = this.getSalary();
		int otherSalary = other.getSalary();
		if (thisSalary < otherSalary) {
			return -1;
		} else if (thisSalary == otherSalary) {
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Engineer e1 = new Engineer("青木", 100000, 2, 12);
		Engineer e2 = new Engineer("中村", 200000, 20, 25);
		e1.show();
		e1.addBasicSalary(5000);
		e1.show();
		System.out.println("----------");
		e2.show();
		System.out.println("----------");
		System.out.println(e1.name + "の雇用年数は" + e2.name + "の雇用年数と比べ、" + e1.compareHireYears(e2));
		System.out.println(e1.name + "の給与は" + e2.name + "の給与と比べ、" + e1.compareSalary(e2));
	}

}
