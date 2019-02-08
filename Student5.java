
public class Student5 {

	int id;
	String name;
	int credits;

	Student5() {
		id = 800000;
		name = "名前がありません";
		credits = 0;
	}

	Student5(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Student5(int id, String name, int credits) {
		this.id = id;
		this.name = name;
		this.credits = credits;
	}

	public static void main(String[] args) {
		Student5 p1 = new Student5();
		Student5 p2 = new Student5(800999, "若馬　大輔");
		Student5 p3 = new Student5(900999, "入門　若葉", 61);

		p1.show();
		System.out.println("----------");
		p2.show();
		System.out.println("----------");
		p3.show();
	}

	public void show() {
		System.out.println("学生番号：" + id);
		System.out.println("名前：" + name);
		System.out.println("単位：" + credits);
	}

}
