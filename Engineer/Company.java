
public class Company {

	String name; // 名前
	Engineer[] engineers; // 本会社に勤務している技術者

	public Company(String n, Engineer[] e) {
		name = n;
		engineers = e;
	}

	double getAverageSalary() {
		int total = 0;
		for (Engineer engineer : engineers) {
			total += engineer.getSalary();
		}
		return (double) total / engineers.length;
	}

	public String toString() {
		return "会社名=" + name + ", 給与=" + getAverageSalary();
	}

	public void show() {
		System.out.println(this.toString());
		for (Engineer engineer : engineers) {
			engineer.show();
		}
	}

	public static void main(String[] args) {
		System.out.println("\nその４------------");
		Engineer[] engineers1 = new Engineer[2];
		engineers1[0] = new Engineer("青木", 100000, 2, 12);
		engineers1[1] = new Engineer("中村", 200000, 20, 25);
		Company c11 = new Company("白立", engineers1);

		System.out.println("会社情報出力");
		System.out.println("---------------------------------");
		System.out.println("全技術者の給与の平均値：" +
				c11.getAverageSalary());
		c11.show();

		System.out.println("---------------------------------");
		Engineer[] engineers2 = new Engineer[3];
		engineers2[0] = new Engineer("赤城", 200000, 2, 12);
		engineers2[1] = new Engineer("中田", 300000, 25, 25);
		engineers2[2] = new Engineer("田村", 100000, 5, 30);
		Company c2 = new Company("凍芝", engineers2);

		System.out.println("会社情報出力");
		System.out.println("---------------------------------");
		System.out.println("全技術者の給与の平均値：" +
				c2.getAverageSalary());
		c2.show();

	}
}
