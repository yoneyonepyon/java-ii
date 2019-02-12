
public class Student8 {

	int id;
	String name;
	int credits;

	Student8() {
		id = 800000;
		name = "名前がありません";
		credits = 0;
	}

	Student8(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Student8(int id, String name, int credits) {
		this.id = id;
		this.name = name;
		this.credits = credits;
	}

	public static void main(String[] args) {
		Student8 p1 = new Student8(800999, "若馬　大輔", 45);
		Student8 p2 = new Student8(900999, "入門　若葉", 200);

		p1.show();
		System.out.println("----------");
		p2.show();
		System.out.println("----------");
		System.out.println("学生番号800999の単位数は卒業要件をみたしていますか？" + p1.isGraduate());
		System.out.println("学生番号800999の単位数は学生番号900999の単位数と比べ、" + p1.compareCredits(p2.credits));
		System.out.println("学生番号900999の単位数は学生番号800999の単位数と比べ、" + p2.compareCredits(p1.credits));
		p2.credits = p1.credits;
		System.out.println("学生番号900999の単位数は学生番号800999の単位数と比べ、" + p2.compareCredits(p1.credits));
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

	public boolean isGraduate() {
		return credits > 123;
	}

	public int compareCredits(int otherCredits) {
		if (credits < otherCredits) {
			return -1;
		} else if (credits == otherCredits) {
			return 0;
		} else {
			return 1;
		}
	}

}
