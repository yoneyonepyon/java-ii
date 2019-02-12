
public class Family2 {

	String name; // 家族の苗字
	Person person; // 家族の構成員（★１人）
	Person person2; // 家族の構成員（追加★）

	public Family2(String n, Person p1, Person p2) {
		name = n;
		person = p1;
		person2 = p2;
	}

	public void displayPrint() {
		System.out.println("苗字：name=" + name);
		System.out.println("	年齢の合計 = " + this.getTotal());
		person.displayPrint();
		person2.displayPrint();
	}

	private int getTotal() {
		return person.age + person2.age;
	}

	public static void main(String[] args) {
		Person person = new Person("太郎", 50);
		Person person2 = new Person("次郎", 20);
		Family2 tanaka = new Family2("田中", person, person2);
		// 下文で、家族 tanaka の家族情報を出力します。その中に、
		// その家族の構成員情報を出力します。
		tanaka.displayPrint();
	}

}
