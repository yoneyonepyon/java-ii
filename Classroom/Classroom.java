
public class Classroom {

	String name; // 学級名
	Student[] students; // 学生

	public static void main(String[] args) {
		Student[] students = new Student[] {
				new Student(800101, "先井　翔", 40),
				new Student(800102, "酒井　和寿", 200),
		};
		Classroom sakura = new Classroom("さくら", students);
		sakura.show();
		System.out.println("---------------------------------");
		students = new Student[] {
				new Student(700101, "上図　達男", 30),
				new Student(700102, "植宮　数夫", 100),
				new Student(700103, "梅崎　由里香", 200),
		};
		Classroom ume = new Classroom("うめ", students);
		ume.show();
		System.out.println(sakura.name + "組の平均取得単位数は" +
				ume.name + "組の平均取得単位数と比べ、" +
				sakura.compareCredits(ume));
	}

	private String compareCredits(Classroom other) {
		double a = averageCredits();
		double b = other.averageCredits();
		if (a < b) {
			return "少ない";
		} else if (a == b) {
			return "等しい";
		} else {
			return "多い";
		}
	}

	private void show() {
		System.out.println("学級名=" + name +
				", 人数=" + students.length +
				", 平均取得単位数=" + this.averageCredits());
		System.out.println("内訳");
		for (int i = 0; i < students.length; i++) {
			System.out.println("" + (i + 1) + ".");
			Student student = students[i];
			student.show();
		}
		System.out.println();
	}

	private double averageCredits() {
		int total = 0;
		for (Student student : students) {
			total += student.credits;
		}
		return (double) total / students.length;
	}

	public Classroom(String name, Student[] students) {
		this.name = name;
		this.students = students;
	}

}
