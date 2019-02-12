// 学生クラス:１科目だけの点数
public class Student2 {
	int bangou; // 学生番号
	String name; // 氏名
	Kamoku kamoku; // 試験の科目（１科目だけ★）
	Kamoku kamoku2; // 試験の科目（追加★）

	public Student2(int bangou, String name, Kamoku kamoku, Kamoku kamoku2) {
		this.bangou = bangou;
		this.name = name;
		this.kamoku = kamoku;
		this.kamoku2 = kamoku2;
	}

	// 自インスタンスの学生情報を出力します
	// その時、その学生の「試験の科目」情報も出力します。
	void displayPrint() {
		// 最初に、自インスタンス学生情報（学生の番号、名前）を出力します
		System.out.println("学生：bangou=" + bangou + ", name=" + name);
		int total = this.getTotal();
		System.out.println("	合計点 = " + total);
		// 次に、その学生の「試験の科目」情報を出力します。
		kamoku.displayPrint();
		kamoku2.displayPrint();
	}

	public static void main(String[] args) {
		Kamoku kokugo = new Kamoku("国語", 63);
		Kamoku suugaku = new Kamoku("数学", 90);
		Student2 tanaka = new Student2(1, "田中", kokugo, suugaku);
		tanaka.displayPrint();
	}

	private int getTotal() {
		return kamoku.tensuu + kamoku2.tensuu;
	}
}
/*
 * 学生：bangou=1, name=田中 科目：namae=国語, tensuu=63
 */