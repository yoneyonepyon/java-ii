
public class Family3 {

	String name; // 家族の苗字
	Person[] persons; // 家族の構成員（★複数人）

	public Family3(String n, Person[] p) {
		name = n;
		persons = p;
	}

	public void displayPrint() {
		System.out.println("苗字：name=" + name);
		System.out.println("	年齢の合計 = " + this.getTotal());
		for (Person person : persons) {
			person.displayPrint();
		}
	}

	private int getTotal() {
		int total = 0;
		for (Person person : persons) {
			total += person.age;
		}
		return total;
	}

	public static void main(String[] args) {
		Person[] persons = new Person[2];
		persons[0] = new Person("太郎", 50);
		persons[1] = new Person("次郎", 20);
		Family3 tanaka = new Family3("田中", persons);
		tanaka.displayPrint();
	}

}
