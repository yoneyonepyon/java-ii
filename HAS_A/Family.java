
public class Family {

	String name; // 家族の苗字
	Person person; // 家族の構成員（★１人）

	public Family(String n, Person p) {
		name = n;
		person = p;
	}

	public void displayPrint() {
		System.out.println("苗字：name=" + name);
		person.displayPrint();
	}

	public static void main(String[] args) {
		Person person = new Person("太郎", 50);
		Family tanaka = new Family("田中", person);
		// 下文で、家族 tanaka の家族情報を出力します。その中に、
		// その家族の構成員情報を出力します。
		tanaka.displayPrint();
	}

}
