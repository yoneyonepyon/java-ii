
public class Student6 {

	int id;
	String name;
	int credits;

	Student6() {
		id = 800000;
		name = "名前がありません";
		credits = 0;
	}

	Student6(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Student6(int id, String name, int credits) {
		this.id = id;
		this.name = name;
		this.credits = credits;
	}

	public static void main(String[] args) {
		Student6 p1 = new Student6(800999, "若馬　大輔", 45);
		Student6 p2 = new Student6(900999, "入門　若葉", 200);

		p1.show();
		System.out.println("----------");
		p2.show();
	}

	public void show() {
		System.out.println("学生番号：" + id);
		System.out.println("名前：" + name);
		System.out.println("単位：" + credits);
		System.out.println("必要単位：" + creditsRemainder());
	}

	public int creditsRemainder() {
		if (credits > 124) {
			return 0;
		}
		return 124 - credits;
	}

}
