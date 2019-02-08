
public class Student3 {

	int id = 800000;
	String name = "名前がありません";
	int credits = 0;

	public static void main(String[] args) {
		Student3 p1 = new Student3();
		Student3 p2 = new Student3();

		p1.setData(800999, "若馬　大輔");
		p1.setCredits(45);

		System.out.println("学生番号：" + p1.id);
		System.out.println("名前：" + p1.name);
		System.out.println("単位：" + p1.credits);

		System.out.println("----------");

		p2.setData(900999, "入門　若葉");
		p2.setCredits(61);

		System.out.println("学生番号：" + p2.id);
		System.out.println("名前：" + p2.name);
		System.out.println("単位：" + p2.credits);
	}

	private void setData(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

}
