
public class Student4 {

	int id = 800000;
	String name = "名前がありません";
	int credits = 0;

	public static void main(String[] args) {
		Student4 p1 = new Student4();
		Student4 p2 = new Student4();

		p1.setData(800999, "若馬　大輔");
		p1.setCredits(45);
		p1.show();

		System.out.println("----------");

		p2.setData(900999, "入門　若葉");
		p2.setCredits(61);
		p2.show();
	}

	private void setData(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public void show() {
		System.out.println("学生番号：" + id);
		System.out.println("名前：" + name);
		System.out.println("単位：" + credits);
	}

}
