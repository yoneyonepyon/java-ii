
public class Manager {

	String name; // 名前
	int basicSalary; // 基本給 単位 (円)
	int hireYears; // 勤務年数
	String secretaryName; // 秘書の氏名

	public Manager(String n, int bs, int hy, String sn) {
		name = n;
		basicSalary = bs;
		hireYears = hy;
		secretaryName = sn;
	}

	// 基本給の加算
	void addBasicSalary(int displacement) {
		basicSalary += displacement;
	}

	// 給与の取得
	int getSalary() {
		return basicSalary + 70000 + hireYears * 2000;
	}

	public String toString() {
		return "管理者 氏名=" + name +
				", 基本給=" + basicSalary +
				", 勤務年数=" + hireYears +
				", 給与=" + getSalary() +
				", 秘書=" + secretaryName;
	}

	public void show() {
		System.out.println(this.toString());
	}

	public int compareHireYears(Manager other) {
		if (hireYears < other.hireYears) {
			return -1;
		} else if (hireYears == other.hireYears) {
			return 0;
		} else {
			return 1;
		}
	}

	public int compareSalary(Manager other) {
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
		Manager e1 = new Manager("木村", 300000, 25, "村田");
		Manager e2 = new Manager("斉藤", 250000, 20, "藤田");
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
