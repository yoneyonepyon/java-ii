
public class Student2 {

	int id = 800000;
	String name = "名前がありません";
	int credits = 0;

	public static void main(String[] args) {
		Student2 p1 = new Student2();
		Student2 p2 = new Student2();

		// p1.id = 800999;
		// p1.name = "若馬 大輔";
		// p1.credits = 45;

		System.out.println("学生番号：" + p1.id);
		System.out.println("名前：" + p1.name);
		System.out.println("単位：" + p1.credits);

		System.out.println("----------");

		p2.id = 900999;
		p2.name = "入門　若葉";
		p2.credits = 61;

		System.out.println("学生番号：" + p2.id);
		System.out.println("名前：" + p2.name);
		System.out.println("単位：" + p2.credits);
	}

}
