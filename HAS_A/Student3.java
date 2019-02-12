// 学生クラス:１科目だけの点数
public class Student3 {
	int bangou; // 学生番号
	String name; // 氏名
	Kamoku[] kamokus; // 変更★試験の点数（複数科目★）

	public Student3(int bangou, String name, Kamoku[] kamokus) {
		this.bangou = bangou;
		this.name = name;
		this.kamokus = kamokus;
	}

	// 自インスタンスの学生情報を出力します
	// その時、その学生の「試験の科目」情報も出力します。
	void displayPrint() {
		// 最初に、自インスタンス学生情報（学生の番号、名前）を出力します
		System.out.println("学生：bangou=" + bangou + ", name=" + name);
		int total = this.getTotal();
		System.out.println("	合計点 = " + total);
		// 次に、その学生の「試験の科目」情報を出力します。
		for (Kamoku kamoku : kamokus) {
			kamoku.displayPrint();
		}
	}

	public static void main(String[] args) {
		Kamoku[] kamokus = new Kamoku[2];
		kamokus[0] = new Kamoku("国語", 63);
		kamokus[1] = new Kamoku("数学", 90);
		Student3 tanaka = new Student3(1, "田中", kamokus);
		tanaka.displayPrint();
	}

	private int getTotal() {
		int total = 0;
		for (Kamoku kamoku : kamokus) {
			total += kamoku.tensuu;
		}
		return total;
	}
}
/*
 * 学生：bangou=1, name=田中 科目：namae=国語, tensuu=63
 */