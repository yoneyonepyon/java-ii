// メソッド isGraduate、compareCreditsの追加

public class Student {
	static final int MINIMUM_CREDITS = 124; // 卒業に必要な単位数
	int id = 800000; // 学生番号
	String name = "名前がありません"; // 名前
	int credits = 0; // 取得済み単位数

	public Student() {
	}

	public Student(int id, String name) {
		setData(id, name);
	}

	public Student(int id, String name, int credits) {
		setData(id, name);
		setCredits(credits);
	}

	void show() {
		System.out.println("学生番号：" + id);
		System.out.println("名前：" + name);
		System.out.println("単位：" + credits);
		System.out.println("必要単位：" + credistRemainder());
	}

	void setData(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void setCredits(int credits) {
		this.credits = credits;
	}

	int credistRemainder() {
		int rem = MINIMUM_CREDITS - credits;
		if (rem < 0) {
			rem = 0;
		}
		return rem;
	}

	// 以下で「引数なし」であることに注意してください★
	// 以下で「引数」を定義すると、
	// そのメソッドはオブジェクト指向のメソッドではありません。
	// C言語の関数と同じとなります。
	boolean isGraduate() {
		if (credits >= MINIMUM_CREDITS)
			return true;
		else
			return false;

		// 上文の４行を、以下では１文で記述します。
		// return credits >= MINIMUM_CREDITS;
	}

	// 以下で「自分と他人」を比較するとき、
	// 「他人」を引数で渡し、
	// 「自分」は、自クラスのインスタンス・フィールドを
	// 使用することに注意してください。★
	int compareCredits(Student st) {
		if (credits < st.credits)
			return -1;
		else if (credits == st.credits)
			return 0;
		else
			return 1;
	}

	public static void main(String[] args) {
		Student p1 = new Student(800999, "若馬　大輔", 45);
		p1.show();
		System.out.println("----------");

		//
		Student p2 = new Student(900999, "入門　若葉", 200);
		p2.show();
		System.out.println("----------");

		System.out.println(
				"学生番号" + p1.id + "の単位数は" +
						"卒業要件をみたしていますか？" +
						p1.isGraduate());
		System.out.println(
				"学生番号" + p2.id + "の単位数は" +
						"卒業要件をみたしていますか？" +
						p2.isGraduate());

		System.out.println(
				"学生番号" + p1.id + "の単位数は" +
						"学生番号" + p2.id + "の単位数と比べ、" +
						p1.compareCredits(p2));

		System.out.println(
				"学生番号" + p2.id + "の単位数は" +
						"学生番号" + p1.id + "の単位数と比べ、" +
						p2.compareCredits(p1));

		p1.credits = p2.credits;
		System.out.println(
				"学生番号" + p2.id + "の単位数は" +
						"学生番号" + p1.id + "の単位数と比べ、" +
						p2.compareCredits(p1));
	}
}
